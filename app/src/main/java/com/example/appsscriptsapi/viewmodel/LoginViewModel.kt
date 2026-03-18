package com.example.appsscriptsapi.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.appsscriptsapi.data.RepositorioPreferencias

class LoginViewModel(private val prefs: RepositorioPreferencias) : ViewModel() {
    var usuario by mutableStateOf("")
    var password by mutableStateOf("")
    var loginExitoso by mutableStateOf(false)

    fun intentarLogin() {
        if (usuario.isNotBlank() && password == "1234") {
            prefs.guardarUsuario(usuario)
            loginExitoso = true
            println("DEBUG: Login correcto para $usuario")
        } else {
            println("DEBUG: Login fallido. Usuario: $usuario, Pass: $password")
        }
    }
}