package com.kiun.poiexcore.uilts


inline fun Any.toMap(): Map<String, Any> {

    val map = HashMap<String, Any>()
    this.javaClass.declaredFields.forEach {
        it.isAccessible = true
        map[it.name] = it.get(this)
    }
    return map
}
