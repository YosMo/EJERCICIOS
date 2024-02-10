package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun TheBox(){
    Box(modifier = Modifier
        .height(250.dp)
        .width(250.dp)
        .verticalScroll(rememberScrollState())
        .background(
            Color(0xFF673AB7)
        )
    ){
        //Aqui el contenido
        Text(text = "CAJA5",
        modifier = Modifier.align(Alignment.Center))

        Text(text = "CAJA8", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "CAJA2", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "CAJA1", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "CAJA3", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "CAJA4", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "CAJA6", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "CAJA8", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "CAJA7", modifier = Modifier.align(Alignment.BottomStart))
    }}


@Composable
fun MyNumberBox(numero:Int,modificador:Modifier,color: Color = Color.Blue){
    Text(text = "Caja $numero",
    modifier = modificador,
    color = color
    )
}

@Preview(showBackground = true)
@Composable
fun TheBox2(){
    Box(modifier =
    Modifier
        .fillMaxSize()
        .background(Color.Cyan)){

        MyNumberBox(1,
            Modifier.align((Alignment.TopStart)),
            Color.White
        )

        MyNumberBox(2,
            Modifier.align((Alignment.TopCenter)),
            Color.Red
        )

        MyNumberBox(3,
            Modifier.align((Alignment.TopEnd)),
            Color.Yellow
        )

        MyNumberBox(4,
            Modifier.align((Alignment.CenterStart)),
        )

        MyNumberBox(5,
            Modifier.align((Alignment.Center)),
            Color.Green
        )

        MyNumberBox(6,
            Modifier.align((Alignment.CenterEnd)),
            Color.Black
        )
    }

}