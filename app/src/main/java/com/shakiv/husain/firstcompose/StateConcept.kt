package com.shakiv.husain.firstcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun NotificationScreen() {
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var count: MutableState<Int> = rememberSaveable { mutableStateOf(0) }
        NotificationCounter(count.value) { count.value++ }
        MessageBar(count.value)
    }
}

@Composable
fun MessageBar(count: Int) {

    Card(
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier.padding(16.dp)
    ) {

        Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "",
                modifier = Modifier.padding(4.dp)
            )

            Text(text = "Message Sent So far - $count")
        }


    }
}


@Composable fun NotificationCounter(count: Int, increament: () -> Unit) {

//    var count: MutableState<Int> = rememberSaveable { mutableStateOf(0) }
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent ${count} Notification")
        Button(onClick = {
            increament()
            Log.d("TAG", "NotificationCounter: ${count}")
        }) {
            Text(text = "Send Notification.")
        }
    }

}
