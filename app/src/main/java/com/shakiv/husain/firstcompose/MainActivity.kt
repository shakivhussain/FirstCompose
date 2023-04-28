package com.shakiv.husain.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello Shakiv Husain")
        }
    }
}

@Composable
fun sayShakivHusain(name: String) {
    Text(
        text = "Say : $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Blue,
        fontSize = 36.sp,
        textAlign = TextAlign.Center
    )
}


@Preview(showBackground = true, name = "Shakib1", showSystemUi = true, widthDp = 400, heightDp = 400)
@Composable
fun previewFunction() {
//    sayShakivHusain(name = "Shakib Mansoori")

}
