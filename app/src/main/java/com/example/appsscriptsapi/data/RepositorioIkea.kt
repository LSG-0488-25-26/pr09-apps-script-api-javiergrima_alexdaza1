package com.example.appsscriptsapi.data

import com.example.appsscriptsapi.model.RespuestaApi

class RepositorioIkea {
    private val api = InstanciaRetrofit.api

    suspend fun obtenerTodo(apiKey: String): RespuestaApi {
        return api.obtenerProductos("list", apiKey)
    }
}