package com.kiun.poiexcore.uilts

import java.util.*
import java.util.concurrent.TimeUnit


class NanoClock(val title: String) {

    var beginTime: Date? = null

    var endTime: Date? = null

    var use: Long = 0

    var lastTime: Long = 0

    var time = 0

    fun begin(){
        beginTime = Date()
        use = 0
        lastTime = 0
        time = 0
    }

    fun end(){
        endTime = Date()
        println("[${title}] 总用时 ${use} ms, 执行次数 ${time} 经历时长 ${(endTime!!.time - beginTime!!.time)} ms")
    }

    fun stepBegin(){
        lastTime = getCurrentTimeMs()
        time ++
    }

    fun stepEnd(){
        use += (getCurrentTimeMs() - lastTime)
    }

    private fun getCurrentTimeMs(): Long {
        return System.currentTimeMillis() + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() % 1000000L)
    }
}
