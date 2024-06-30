package com.kiun.poiexcore.plugs

import com.kiun.poiexcore.base.ConfigDataBase
import com.kiun.poiexcore.base.NodeValue
import com.kiun.poiexcore.uilts.ObjectUtil
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.util.CellRangeAddress
import org.w3c.dom.Node

/**
 * 分组合并
 */
class GroupMerge(node: Node) : ConfigDataBase(node) {

    /**
     * 分组字段
     */
    private var fields: NodeValue<Array<String>>? = null
    private var fieldArray: Array<String>? = null

    init {
        fieldArray = fields?.toValue(null)
    }

    private var lastValue: String? = null
    private var lastIndex: Int = -1

    override fun listToStart(startRow: Row, list: Collection<Any>?): Collection<Any>? {

        val allFields = fieldArray ?: throw Exception("分组字段必须存在")

        val compareList = allFields.map { filed ->
            return@map { it: Any -> ObjectUtil.getValue<Any>(it, filed, null)?.toString() }
        }.toTypedArray()

        return list?.sortedWith(compareBy(*compareList))
    }

    private fun stringForFields(t : Any): String{
        val sb = StringBuffer()
        fieldArray?.forEach {
            sb.append(ObjectUtil.getValue<Any>(t, it, null)?.toString())
        }
        return sb.toString()
    }

    override fun dataToCell(cell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {

        val cellValue = map["t"]?.let { stringForFields(it) }

        if(lastValue != cellValue){

            if (lastIndex > -1 && (rowNum - 1) - lastIndex > 0){
                //开始合并
                try {
                    cell.sheet.addMergedRegion(CellRangeAddress(lastIndex, rowNum - 1, columnNum, columnNum))
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }
            lastIndex = rowNum
            lastValue = cellValue
        }
    }

    override fun listToEnd(endCell: Cell?, list: Collection<Any>) {
        try {
            if(endCell != null && endCell.rowIndex - lastIndex > 0){
                endCell.sheet.addMergedRegion(CellRangeAddress(lastIndex, endCell.rowIndex, endCell.columnIndex, endCell.columnIndex))
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
