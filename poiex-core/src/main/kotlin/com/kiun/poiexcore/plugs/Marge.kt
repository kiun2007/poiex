package com.kiun.poiexcore.plugs

import com.kiun.poiexcore.base.ConfigDataBase
import com.kiun.poiexcore.base.NodeValue
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.util.CellRangeAddress
import org.w3c.dom.Node

/**
 * 合并配置(命名错误)
 */
@Deprecated("命名错误, 已更改为Merge")
class Marge(node: Node) : ConfigDataBase(node){

    /**
     * 垂直合并个数
     */
    var v: NodeValue<Int>? = null

    /**
     * 水平合并个数
     */
    var h: NodeValue<Int>? = null

    override fun dataToCell(cell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {

        val vMarge = v?.toValue(map)?:1
        val hMarge = h?.toValue(map)?:1

        if (vMarge > 1 || hMarge > 1) {
            try {
                cell.sheet.addMergedRegion(CellRangeAddress(cell.rowIndex, cell.rowIndex + vMarge - 1, cell.columnIndex, cell.columnIndex + hMarge - 1))
            } catch (ex: IllegalStateException) {
                ex.printStackTrace()
            }
        }
    }
}
