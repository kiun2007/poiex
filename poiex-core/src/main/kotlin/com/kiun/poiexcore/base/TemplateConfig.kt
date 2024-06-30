package com.kiun.poiexcore.base

import org.w3c.dom.Node
import java.io.ByteArrayInputStream
import java.nio.charset.Charset
import javax.xml.parsers.DocumentBuilderFactory

data class TemplateConfig(
    val xml: String,
    val configs: MutableMap<Class<*>, ConfigDataBase> = HashMap()
){
    init {

        val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        val document = builder.parse(ByteArrayInputStream(xml.toByteArray(Charset.forName("UTF-8"))))

        val rootElement = document.documentElement
        for(i in 0 until rootElement.childNodes.length){
            val node = rootElement.childNodes.item(i)
            if (node.nodeType != Node.TEXT_NODE){
                try{
                    val clz = Class.forName("com.kiun.poiexcore.plugs.${node.nodeName}") as Class<ConfigDataBase>
                    val templateConfig = clz.getConstructor(Node::class.java).newInstance(node)
                    configs.put(clz, templateConfig)
                } catch (ex: Exception){
                    ex.printStackTrace()
                }
            }
        }
    }
}
