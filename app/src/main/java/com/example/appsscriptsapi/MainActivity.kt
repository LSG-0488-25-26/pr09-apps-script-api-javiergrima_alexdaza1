package com.example.appsscriptsapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appsscriptsapi.view.PantallaCatalogo
import com.example.appsscriptsapi.view.PantallaLogin
import com.example.appsscriptsapi.viewmodel.IKEAViewModel
import com.example.appsscriptsapi.viewmodel.LoginViewModel
import com.example.appsscriptsapi.viewmodel.ViewModelProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var logueado by remember { mutableStateOf(false) }

            if (!logueado) {
                val loginVM: LoginViewModel = viewModel(factory = ViewModelProvider.Factory)
                PantallaLogin(loginVM) { logueado = true }
            } else {
                val ikeaVM: IKEAViewModel = viewModel(factory = ViewModelProvider.Factory)
                PantallaCatalogo(ikeaVM)
            }
        }
    }
}