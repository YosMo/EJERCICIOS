package com.example.holamundo.components

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TheRow(){
    Row( modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceAround,
    verticalAlignment = Alignment.Bottom
    ){
        /*Aqui el contenido*/
        Text(text = "E 1",
        modifier = Modifier
            .background(Color.Yellow)
            .padding(16.dp)
        )
        Text(text = "E 2",
        modifier = Modifier
            .background(Color.Green)
            .padding(start = 32.dp)
        )
        Text(text = "E 3",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(start = 32.dp, end = 16.dp, bottom = 6.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TheRow2(){
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement =
        Arrangement.SpaceBetween
        ){

        /*Aqui el contenido*/
        Text(text = "E 1",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text(text = "E 2",
            modifier = Modifier
                .background(Color.Green)
                .padding(start = 32.dp)
        )
        Text(text = "E 3",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(start = 32.dp, end = 16.dp, bottom = 6.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TheRow3(){
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement =
        Arrangement.SpaceEvenly
    ){

        /*Aqui el contenido*/
        Text(text = "E 1",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text(text = "E 2",
            modifier = Modifier
                .background(Color.Green)
                .padding(start = 32.dp)
        )
        Text(text = "E 3",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(start = 32.dp, end = 16.dp, bottom = 6.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TheRow4(){
    Row(){
        /*Aqui el contenido*/
        Text("E 1",
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .weight(1f)
        )
        Text(text = "E 2",
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .weight(2f)
        )
        Text(text = "E 3",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .weight(1f)
        )
    }
}