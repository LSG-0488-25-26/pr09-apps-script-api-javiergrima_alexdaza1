package com.example.appsscriptsapi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appsscriptsapi.data.RepositorioIkea

class IkeaViewModelFactory(private val repositorio: RepositorioIkea) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IKEAViewModel::class.java)) {
            return IKEAViewModel(repositorio) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}