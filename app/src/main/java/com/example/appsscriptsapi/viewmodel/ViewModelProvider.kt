package com.example.appsscriptsapi.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.appsscriptsapi.data.RepositorioIkea
import com.example.appsscriptsapi.data.RepositorioPreferencias

object ViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            val contexto = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as android.app.Application)
            IKEAViewModel(RepositorioIkea())
        }
        initializer {
            val contexto = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as android.app.Application)
            LoginViewModel(RepositorioPreferencias(contexto))
        }
    }
}