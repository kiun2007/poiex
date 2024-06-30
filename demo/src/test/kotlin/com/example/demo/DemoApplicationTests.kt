package com.example.demo

import com.kiun.poiexcore.uilts.FelUtil
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

    @Test
    fun contextLoads() {
        val a = FelUtil.exec("b[1]", mapOf("a" to "b"))
//        val a = FelUtil.exec("('1')", mapOf("a" to "b"))
        FelUtil.exec("['a', 'b']", mapOf("a" to "b"))
    }
}
