package com.kiun.poiexcore.plugs

import com.kiun.poiexcore.base.ConfigDataBase
import org.apache.poi.ss.usermodel.Cell
import org.w3c.dom.Node

/**
 * 分组统计
 */
class GroupCount(node: Node) : ConfigDataBase(node) {

    override fun isGlobal(): Boolean {
        return true
    }

    override fun dataToCell(cell: Cell, sourceCell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {

    }
}
