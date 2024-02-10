package com.example.holamundo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundo.R

@Preview(showBackground = true)
@Composable
fun TheImage(){
    Column(){
        Image(
            painter = painterResource(id = R.drawable.seal),
            contentDescription= "Imagen de Prueba",
            modifier = Modifier
                .size(70.dp),
            contentScale = ContentScale.FillBounds,
            alpha = 0.7f
        )
        Text (text = "Foca Gorda")
    }
}

@Preview(showBackground = true)
@Composable
fun TheIcon(){
    Column() {
        Icon(painter = painterResource(
            id = R.drawable.baseline_auto_fix_normal_24),
            contentDescription = "icono",
            tint = Color(0xFFCC934F)
        )

        Icon(imageVector = Icons.Filled.Add,
        contentDescription = "icon2")
    }
}