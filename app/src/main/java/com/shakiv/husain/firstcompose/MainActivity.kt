package com.shakiv.husain.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello Shakiv Husain")
        }
    }
}


@Preview(
    showBackground = true, name = "Shakiv Husain", showSystemUi = true, widthDp = 400,
    heightDp = 400
)
@Composable
fun previewFunction() {
    buttonComposable()
}

@Composable
fun buttonComposable() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,

            ),
        enabled = true,
    ) {

        // Will Accept the content

        sayShakivHusain(name = "Shakiv ")
        printImage()
    }
}

@Composable
fun printImage() {
    Image(
        painter = painterResource(id = R.drawable.my_img),
        contentDescription = "My Personal Image",
//        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun sayShakivHusain(name: String) {
    Text(
        text = "Say : $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Blue,
        fontSize = 26.sp,
        textAlign = TextAlign.Center
    )
}



