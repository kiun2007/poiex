package com.kiun.poiexcore.base

import com.kiun.poiexcore.uilts.FelUtil
import com.kiun.poiexcore.uilts.JexlUtil

data class NodeValue<T>(
    /**
     * 固定值
     */
    val fixed: String? = null,

    /**
     * 公式
     */
    val formula: String? = null
){
    fun toValue(map: Map<String, Any>?): T? {

        if (formula == null)
            return fixed as T
        return JexlUtil.exec(formula, map) as T
    }
}
