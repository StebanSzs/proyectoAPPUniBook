package com.example.app_biblioteca

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login_jetpack_compose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black), // Fondo negro
        contentAlignment = Alignment.BottomCenter // Contenido centrado en la parte inferior
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(56.dp))
            SearchBar()
        }
        Image(
            painter = painterResource(id = R.drawable.logounibook),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp) // Ajustar el tamaño del logo
                .padding(bottom = 16.dp) // Añadir un espacio en la parte inferior
        )
    }
}

@Composable
fun SearchBar() {
    val searchTextState = remember { mutableStateOf("") }

    OutlinedTextField(
        value = searchTextState.value,
        onValueChange = { searchTextState.value = it },
        label = { Text("Buscar") },
        singleLine = true,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    )
}
