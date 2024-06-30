package com.example.demo.data

data class PageResult<T>(

    var total: Int? = null,

    var list: List<T>? = null
)

data class ResultBean<T>(
    var data: T? = null
)
