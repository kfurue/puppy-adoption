package com.example.puppyadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.puppyadoption.ui.theme.PuppyAdoptionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyAdoptionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewsStory()
                }
            }
        }
    }
}

@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.puppyadoptionimage_1),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(16.dp))

        Text("A day in Shark Fin Cove",
            style = typography.h6)
        Text("Davenport, California",
            style = typography.body2)
        Text("December 2018",
            style = typography.body2)
    }
}

@Composable
fun MessageList(messages: List<String>) {
    Column {
        messages.forEach { message ->
            Text(message,
                style = typography.h6)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuppyAdoptionTheme {
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
            NewsStory()
            MessageList(listOf("hoge", "fuga", "foo", "bar"))
        }
    }
}