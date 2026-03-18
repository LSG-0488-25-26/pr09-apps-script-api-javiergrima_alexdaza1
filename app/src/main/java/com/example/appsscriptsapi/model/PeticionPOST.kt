package com.example.appsscriptsapi.model

data class PeticionPOST(
    val action: String,
    val apiKey: String,
    val item: ProductoIkea? = null
)