package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.xml.parsers.DocumentBuilderFactory

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    val clz = DocumentBuilderFactory::javaClass
    runApplication<DemoApplication>(*args)
}
