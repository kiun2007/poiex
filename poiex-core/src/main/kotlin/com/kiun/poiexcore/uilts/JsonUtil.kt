package com.kiun.poiexcore.uilts


inline fun Any.toMap(): Map<String, Any> {

    val map = HashMap<String, Any>()
    this.javaClass.declaredFields.forEach {
        map[it.name] = it.get(this)
    }
    return map
}
