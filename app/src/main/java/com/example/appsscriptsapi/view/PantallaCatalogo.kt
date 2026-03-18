package com.example.appsscriptsapi.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appsscriptsapi.viewmodel.IKEAViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaCatalogo(viewModel: IKEAViewModel) {
    LaunchedEffect(Unit) {
        viewModel.cargarDatos()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Catálogo IKEA") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { padding ->
        if (viewModel.estaCargando) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                items(viewModel.listaProductos) { producto ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = producto.product_name,
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(
                                text = "Tipo: ${producto.product_type}",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "${producto.price} €",
                                color = MaterialTheme.colorScheme.primary,
                                style = MaterialTheme.typography.headlineSmall
                            )
                        }
                    }
                }
            }
        }
    }
}