package com.example.appsscriptsapi.model

import com.google.gson.annotations.SerializedName

data class ProductoIkea(
    @SerializedName("unique_id") val unique_id: String = "",
    @SerializedName("product_name") val product_name: String = "",
    @SerializedName("product_type") val product_type: String = "",
    @SerializedName("main_category") val main_category: String = "",
    @SerializedName("price") val price: Double = 0.0,
    @SerializedName("url") val url: String = ""
)