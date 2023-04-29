package com.shakiv.husain.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
            PreviewItem()
        }
    }
}


@Preview(
    showBackground = true,
    name = "Shakiv Husain",
    showSystemUi = true,
    widthDp = 300,
    heightDp = 300
)
@Composable
fun previewFunction() {
    ImageRound()
}


@Composable
private fun ImageRound() {
    Image(
        painter = painterResource(id = R.drawable.my_img),
        contentDescription = "My Image", contentScale = ContentScale.Crop,
        modifier =
        Modifier.size(500.dp).clip(CircleShape)
            .border(2.dp, Color.Green, CircleShape)
            .shadow(100.dp, RectangleShape,true,Color.Blue)

    )
}

@Composable
private fun ModifierConcept() {
    Text(
        text = "Shakiv Husain",
        color = Color.White,
        modifier = Modifier
            .background(Color.Blue)
            .size(100.dp)
            .padding(56.dp)
            .border(4.dp, Color.White)
            .clip(CircleShape)
            .background(Color.White)
            .clickable {

            },
    )
}

@Composable
private fun ListOfItems() {
    Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        ListViewItem(
            imageId = R.drawable.my_img, title = "Shakiv Husain", designation = "Android Developer",
        )
        ListViewItem(
            imageId = R.drawable.my_img, title = "Shakiv Husain", designation = "Android Developer"
        )
        ListViewItem(
            imageId = R.drawable.my_img, title = "Shakiv Husain", designation = "Android Developer"
        )
        ListViewItem(
            imageId = R.drawable.my_img, title = "Shakiv Husain", designation = "Android Developer"
        )

    }
}

@Composable
private fun ListViewItem(
    imageId: Int, title: String, designation: String, modifier: Modifier = Modifier.padding(16.dp)
) {

    // called chaining
    Row(modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "My Image",
            Modifier.size(70.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = title, fontWeight = FontWeight.ExtraBold)
            Text(text = designation, fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
private fun boxComposable() {

    // FrameLayout
    Box(contentAlignment = Alignment.CenterEnd) {
        Image(painter = painterResource(id = R.drawable.my_img), contentDescription = "Image 1")
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image 2"
        )
    }

}


@Composable
private fun rowComposable() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 30.sp)
        Text(text = "B", fontSize = 30.sp)
    }
}

@Composable
private fun columnComposable() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 30.sp)
        Text(text = "B", fontSize = 30.sp)
    }
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



