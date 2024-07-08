package com.kiun.poiexcore.plugs

import com.kiun.poiexcore.base.ConfigDataBase
import org.apache.poi.ss.usermodel.Cell
import org.w3c.dom.Node
import java.util.regex.Pattern

class AutoHeight(node: Node) : ConfigDataBase(node) {

    fun getregex(charStr: String): Float {
        if (charStr === " ") {
            return 0.5f
        }
        // 判断是否为字母或字符
        if (Pattern.compile("^[A-Za-z0-9]+$").matcher(charStr).matches()) {
            return 0.5f
        }
        // 判断是否为全角
        if (Pattern.compile("[\u4e00-\u9fa5]+$").matcher(charStr).matches()) {
            return 1.00f
        }
        //全角符号 及中文
        return if (Pattern.compile("[^x00-xff]").matcher(charStr).matches()) {
            1.00f
        } else 0.5f
    }
    fun getExcelCellAutoHeight(content: String, fontCountInline: Float, defaultRowHeight: Float): Float
    {
        var defaultCount = 0.00f
        for (i in 0 until content.length) {
            val ff: Float = getregex(content.substring(i, i + 1))
            defaultCount = defaultCount + ff
        }
        return ((defaultCount / fontCountInline).toInt() + 1) * defaultRowHeight //计算

    }

    override fun dataToCell(cell: Cell, sourceCell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {
        val rowHeight = getExcelCellAutoHeight(cell.stringCellValue, 11f, cell.sheet.defaultRowHeightInPoints)
    }
}
