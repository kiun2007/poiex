package com.kiun.poiexcore.base

import com.kiun.poiexcore.uilts.copyBy
import com.kiun.poiexcore.uilts.ObjectUtil
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet

data class CellTemplate(
    /**
     * 模板使用的单元格
     */
    val cell: Cell,

    /**
     * 模板包含的表达式
     */
    val exp: String?,

    /**
     * 配置
     */
    val config: TemplateConfig?
)

data class ListForeach(

    /**
     * 数组字段
     */
    val fieldName: String,

    /**
     * 列单元集合（复制时使用集合内单元）
     */
    val configs: List<CellTemplate>,

    /**
     * 第一个单元行号
     */
    val rowFirst: Int,

    /**
     * 第一个单元列号
     */
    val columnFirst: Int
) {
    fun withColumn(cell: Cell): Boolean {
        return configs.any { it.cell == cell }
    }

    fun write(row: Row, data: Any) {

        val sheet: Sheet = row.sheet
        val list = ObjectUtil.getValue(data, fieldName, List::class.java)
        val startIndex = row.rowNum
        val startColumnIndex = configs[0].cell.columnIndex
        var index = 0
        var newRow = row

        configs.forEach {
            it.config?.configs?.forEach { k,v->
                v.listToStart(row, list as Collection<Any>)
            }
        }

        list.forEach {
            if (index > 0){
                newRow = sheet.createRow(startIndex + index)
            }
            writeRow(newRow, it!!, index, startIndex, startColumnIndex)

            index++
        }

        configs.forEach { cellTemplate->
            cellTemplate.config?.configs?.forEach { (k, v) ->
                v.listToEnd(newRow.getCell(cellTemplate.cell.columnIndex), list as Collection<Any>)
            }
        }
    }

    private fun writeRow(row: Row, rowData: Any, index: Int, rowIndex: Int, startColumnIndex: Int){

        val map = HashMap<String, Any>()
        val _ri = index + rowIndex
        map["_ri"] = _ri
        map["_dataRow"] = index
        map["t"] = rowData

        var i = 0
        configs.forEach {
            val _ci = startColumnIndex + i

            map["_dataCol"] = i
            map["_ci"] = _ci

            val newCell = row.createCell(startColumnIndex + i)
            newCell.copyBy(it.cell, map, it.exp)

            it.config?.configs?.forEach { (_, v) ->
                v.dataToCell(newCell, _ri, _ci, map)
            }
            i ++
        }
    }
}

fun Cell.isForeach(): Boolean {
    return this.cellType == CellType.STRING && (stringCellValue?.startsWith("{{\$fe:") == true)
}

fun Cell.readConfig(): TemplateConfig? {

    val xmlConfig = this.cellComment?.string?.toString()
    if(xmlConfig != null){
        return TemplateConfig(xmlConfig, HashMap())
    }
    return null
}

/**
 * 根据单元格值表达式
 */
fun Cell.foreachByContent() : ListForeach {

    val field = stringCellValue.trim().replace("^\\{\\{\\\$fe: ?(.*) .+?\$".toRegex(), "$1")
    val firstExp = stringCellValue.trim().replace("^\\{\\{\\\$fe: ?.*? (.+?)\$".toRegex(), "$1")

    val configs = ArrayList<CellTemplate>()
    configs.add(CellTemplate(this, firstExp, this.readConfig()))

    for (i in (columnIndex+1) .. this.row.lastCellNum){
        val cell = this.row.getCell(i)
        if (cell.cellType == CellType.STRING){

            if (cell.stringCellValue.endsWith("}}")){
                configs.add(CellTemplate(cell, cell.stringCellValue.replace("}}", ""), cell.readConfig()))
                break
            }
            configs.add(CellTemplate(cell, cell.stringCellValue, cell.readConfig()))
        }
        else {
            configs.add(CellTemplate(cell, null, cell.readConfig()))
        }
    }
    return ListForeach(field, configs, this.rowIndex, this.columnIndex)
}
