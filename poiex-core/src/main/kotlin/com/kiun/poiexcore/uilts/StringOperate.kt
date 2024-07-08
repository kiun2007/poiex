package com.kiun.poiexcore.uilts


/**
 * 字符串转ABGR颜色值
 */
fun String.toABGRColor(): Int
{
    if (this.startsWith("#")){
        return this.substring(1).toLong(16).toInt()
    }

    if (this.startsWith("0x")) {
        return this.substring(2).toLong(16).toInt()
    }
    return this.toInt()
}
