package com.example.appsscriptsapi.data

import com.example.appsscriptsapi.model.RespuestaApi
import retrofit2.http.GET
import retrofit2.http.Query

interface ServicioApiIkea {
    @GET("")
    suspend fun obtenerProductos(
        @Query("action") accion: String,
        @Query("apiKey") clave: String
    ): RespuestaApi
}