package com.example.appsscriptsapi.model

data class RespuestaApi(
    val status: String,
    val data: List<ProductoIkea>? = null,
    val message: String? = null
)