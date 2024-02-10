package com.example.holamundo.components

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Box(){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically){
        /*Aqui el contenido*/
        Column1()
        }

    Row() {
        Column2()
    }

    Row {
        Column3()
    }
    }


@Composable
fun Column1(){
    Column( modifier = Modifier
        .height(350.dp),
        horizontalAlignment = Alignment.End)
    {
        Text ( "HOLA", modifier = Modifier
            /*.background(Color.Magenta)*/
            .padding(14.dp)
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Green)*/
            .padding(14.dp)
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Yellow)*/
            .padding(14.dp)
            .weight(1f))

    }
}

@Composable
fun Column2(){
    Column( modifier = Modifier
        .height(350.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.Start)
    {
        Text ( "AAAa", modifier = Modifier
            /*.background(Color.Magenta)*/
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Green)*/
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Yellow)*/
            .weight(1f))

    }
}

@Composable
fun Column3(){
    Column( modifier = Modifier
        .height(350.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.End)
    {
        Text ( "E3", modifier = Modifier
            .background(Color.Magenta)
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Green)*/
            .weight(1f))
        Text ( "E3", modifier = Modifier
            /*.background(Color.Yellow)*/
            .weight(1f))

    }
}