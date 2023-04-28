package com.shakiv.husain.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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
    Text(text = "Say : $name")
}


@Preview(showBackground = true, name = "Shakib1", showSystemUi = true, widthDp = 400, heightDp = 400)
@Composable
fun previewFunction() {
    sayShakivHusain(name = "Shakib Mansoori")
}
