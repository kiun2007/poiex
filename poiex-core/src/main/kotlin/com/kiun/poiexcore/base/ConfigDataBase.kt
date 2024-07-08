package com.kiun.poiexcore.base

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.w3c.dom.Node
import java.lang.reflect.Field
import java.math.BigDecimal
import java.util.regex.Pattern

abstract class ConfigDataBase(node: Node) {

    init {

        for (i in 0 until node.childNodes.length){

            val child = node.childNodes.item(i)
            if (child.nodeType == Node.TEXT_NODE){
                continue
            }

            var field:Field? = null

            var clz: Class<*>? = this.javaClass
            //遍历父类找到字段
            while (clz != ConfigDataBase::class.java){
                try {
                    field = clz?.getDeclaredField(child.nodeName)
                    break
                } catch (ex: Throwable){
                }
                clz = clz?.superclass
            }

            if (field == null) {
                continue
            }


            val content = child.textContent
            field.isAccessible = true

            if(field.type == NodeValue::class.java){
                val matter = Pattern.compile("^\\{(.+?)\\}$").matcher(content)
                val fv = if (matter.find()) matter.group(1) else null
                field.set(this, NodeValue<Any>(fixed = if (fv!=null) null else content, formula = fv))
            } else if (field.type == String::class.java) {
                field.set(this, content)
            } else if (field.type == Int::class.java) {
                field.set(this, content?.toIntOrNull()?:0)
            } else if (field.type == Short::class.java) {
                field.set(this, content?.toShortOrNull()?: 0.toShort())
            } else if (field.type == Float::class.java) {
                field.set(this, content?.toFloatOrNull() ?: 0.toFloat())
            } else if (field.type == Double::class.java) {
                field.set(this, content?.toDoubleOrNull()?:0.toDouble())
            } else if (field.type == Long::class.java) {
                field.set(this, content?.toLongOrNull()?:0.toLong())
            } else if (field.type == Byte::class.java) {
                field.set(this, content?.toByteOrNull()?:0.toByte())
            } else if (field.type == BigDecimal::class.java) {
                field.set(this, content?.toBigDecimal() ?: 0.0.toBigDecimal())
            }
        }
    }

    /**
     * 是否为全局插件, 全局插件在单行时不生效,
     */
    open fun isGlobal() = false

    /**
     * 开始循环前的列表
     */
    open fun listToStart(startRow: Row, list: Collection<Any>? = null) : Collection<Any>?{
        return list
    }

    /**
     * 循环后的列表
     */
    open fun listToEnd(endCell: Cell?, list: Collection<Any>){
    }

    /**
     * 每个单元格处理
     * @param cell 新创建的单元格
     * @param sourceCell 模板中的单元格
     * @param rowNum 所在行
     * @param columnNum 所在列
     * @param map 数据
     */
    abstract fun dataToCell(cell: Cell, sourceCell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>)
}
