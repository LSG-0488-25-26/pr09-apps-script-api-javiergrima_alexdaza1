package com.example.appsscriptsapi.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appsscriptsapi.data.RepositorioIkea
import com.example.appsscriptsapi.model.ProductoIkea
import kotlinx.coroutines.launch

class IKEAViewModel(private val repositorio: RepositorioIkea) : ViewModel() {
    var listaProductos by mutableStateOf<List<ProductoIkea>>(emptyList())
    var estaCargando by mutableStateOf(false)

    fun cargarDatos() {
        viewModelScope.launch {
            estaCargando = true
            try {
                val respuesta = repositorio.obtenerTodo("CATALOGO_IKEA")
                if (respuesta.status == "ok") {
                    listaProductos = respuesta.data ?: emptyList()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                estaCargando = false
            }
        }
    }
}