package com.shakiv.husain.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
            textFieldComposable()
        }
    }
}


@Preview(
    showBackground = true,
    name = "Shakiv Husain",
    showSystemUi = true,
)
@Composable
fun previewFunction() {
//    textFieldComposable()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFieldComposable() {

    val state = remember { mutableStateOf("") }

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Write something..") },
        placeholder = { Text(text = "Write Something interesting here...") },
    )
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



