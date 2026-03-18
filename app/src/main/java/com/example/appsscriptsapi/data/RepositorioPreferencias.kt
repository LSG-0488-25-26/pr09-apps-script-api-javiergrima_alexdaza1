package com.example.appsscriptsapi.data

import android.content.Context
import android.content.SharedPreferences

class RepositorioPreferencias(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("ikea_prefs", Context.MODE_PRIVATE)

    fun guardarUsuario(nombre: String) {
        sharedPreferences.edit().putString("usuario", nombre).apply()
    }

    fun obtenerUsuario(): String? {
        return sharedPreferences.getString("usuario", null)
    }
}