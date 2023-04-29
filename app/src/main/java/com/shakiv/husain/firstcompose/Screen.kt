package com.shakiv.husain.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewItem() {

    LazyColumn(content = {
        items(
            getCategoryList()
        ) {
            BlogCategory(image = R.drawable.my_img, title = it.title, subtitle = it.subtitle)
        }
    })
}


@Composable
fun LoadColumnItems() {

    // Column will render all the items at ones, not recycle the items
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {

        getCategoryList().map {
            BlogCategory(image = it.image, title = it.title, subtitle = it.subtitle)
        }
    }

}

@Composable
fun BlogCategory(image: Int, title: String, subtitle: String) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "My Image", modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.Companion.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Thin
        )
    }
}


data class Category(val image: Int, val title: String, val subtitle: String)

private fun getCategoryList(): List<Category> {
    val listOfItems = mutableListOf<Category>()
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 1", "Programming Language Description 1")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 2", "Programming Language Description 2")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 3", "Programming Language Description 3")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 4", "Programming Language Description 4")
    )

    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 1", "Programming Language Description 1")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 2", "Programming Language Description 2")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 3", "Programming Language Description 3")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 4", "Programming Language Description 4")
    )

    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 1", "Programming Language Description 1")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 2", "Programming Language Description 2")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 3", "Programming Language Description 3")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 4", "Programming Language Description 4")
    )

    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 1", "Programming Language Description 1")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 2", "Programming Language Description 2")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 3", "Programming Language Description 3")
    )
    listOfItems.add(
        Category(R.drawable.my_img, "Programming Language 4", "Programming Language Description 4")
    )
    return listOfItems
}