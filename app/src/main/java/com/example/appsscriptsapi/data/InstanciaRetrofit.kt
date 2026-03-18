package com.example.appsscriptsapi.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanciaRetrofit {
    private const val URL_BASE = "https://script.google.com/macros/s/AKfycbxyP8fDHp_ryil_t-Y_ss9ZSR7PPBTpZAvVUyV1Sqq4kCxOU3cgustjTGGbl_p1dv3x/exec"

    val api: ServicioApiIkea by lazy {
        Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ServicioApiIkea::class.java)
    }
}