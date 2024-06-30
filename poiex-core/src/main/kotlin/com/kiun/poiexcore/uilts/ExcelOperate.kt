@file:Suppress("UNCHECKED_CAST")

package com.kiun.poiexcore.uilts


import com.kiun.poiexcore.base.ListForeach
import com.kiun.poiexcore.base.foreachByContent
import com.kiun.poiexcore.base.isForeach
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

fun Cell.setAny(value: Any?) {

    if (value is String) {
        if (value.startsWith("=")) {
            this.cellFormula = value.substring(1)
        } else {
            this.setCellValue(value)
        }
    }

    if (value is Number) {
        this.setCellValue(value.toDouble())
    }

    if (value is Date) {
        this.setCellValue(value as Date?)
    }

    if (value is LocalDate) {
        this.setCellValue(value as LocalDate?)
    }

    if (value is LocalDateTime) {
        this.setCellValue(value as LocalDateTime?)
    }
}

fun Cell.copyBy(cell: Cell, data: Any, cellExp: String? = null) {

    when(cell.cellType){
        CellType.STRING-> {
            val exp = cellExp ?: JexlUtil.jsToExp(cell.stringCellValue)
            if (exp != null){
                val v = FelUtil.exec(exp, if(data is Map<*, *>) (data as Map<String, Any>) else data.toMap())
                this.setAny(v)
            } else {
                this.setCellValue(cell.stringCellValue)
            }
        }
        CellType.NUMERIC-> this.setCellValue(cell.numericCellValue)
        CellType.BLANK-> this.cellType = CellType.BLANK
        CellType.BOOLEAN-> this.setCellValue(cell.booleanCellValue)
        CellType.FORMULA-> this.setCellValue(cell.cellFormula)
        CellType.ERROR -> this.setCellErrorValue(cell.errorCellValue)
    }
    this.copyStyle(cell)
}

fun Cell.copyStyle(cell: Cell){
    val offset = this.sheet.workbook.numCellStyles - cell.sheet.workbook.numCellStyles
    cell.cellStyle?.let {
        this.cellStyle = this.sheet.workbook.getCellStyleAt(it.index.toInt() + offset)
    }
}

fun Row.copyBy(row: Row, data: Any) {

    row.rowStyle?.let {
        this.rowStyle = row.sheet.workbook.getCellStyleAt(it.index.toInt())
    }

    var listForeach: ListForeach? = null
    row.forEach{

        if (listForeach?.withColumn(it) == true){
            return@forEach
        }

        //循环开始
        if (it.isForeach()){
            listForeach = it.foreachByContent()
            listForeach?.write(this, data)
        }else{
            val cell = this.createCell(it.columnIndex)
            cell.copyBy(it, data)
        }
    }
}

inline fun Sheet.copyBy(sheet: Sheet, data: Any) {
    //允许公式计算
    sheet.forceFormulaRecalculation = true

    //条件表达式
    val formatting = sheet.sheetConditionalFormatting
    for (i in 0 until formatting.numConditionalFormattings){
        this.sheetConditionalFormatting.addConditionalFormatting(formatting.getConditionalFormattingAt(i))
    }

    sheet.paneInformation?.let {
        sheet.createFreezePane(
            it.horizontalSplitPosition.toInt(),
            it.verticalSplitPosition.toInt(),
            it.horizontalSplitTopRow.toInt(),
            it.verticalSplitLeftColumn.toInt()
        )
    }

    //复制样式
    for (i in 0 until sheet.workbook.numCellStyles){
        val cellStyle = this.workbook.createCellStyle()
        cellStyle.cloneStyleFrom(sheet.workbook.getCellStyleAt(i))
    }

    var maxColumnCount = 0

    sheet.forEach {
        val newRow = this.createRow(this.count())
        newRow.copyBy(it, data)
        maxColumnCount = Math.max(it.lastCellNum.toInt(), maxColumnCount)
    }

    sheet.mergedRegions.forEach {
        this.addMergedRegion(it)
    }

    for (i in 0 .. maxColumnCount){
        this.setColumnWidth(i, sheet.getColumnWidth(i))
    }
}
