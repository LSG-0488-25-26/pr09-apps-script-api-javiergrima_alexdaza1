package com.example.appsscriptsapi.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appsscriptsapi.viewmodel.LoginViewModel

@Composable
fun PantallaLogin(viewModel: LoginViewModel, alLoguear: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.Center) {
        TextField(value = viewModel.usuario, onValueChange = { viewModel.usuario = it }, label = { Text("Usuario") })
        TextField(value = viewModel.password, onValueChange = { viewModel.password = it }, label = { Text("Password") })
        Button(onClick = {
            viewModel.intentarLogin()
            if(viewModel.loginExitoso) alLoguear()
        }) {
            Text("Entrar")
        }
    }
}