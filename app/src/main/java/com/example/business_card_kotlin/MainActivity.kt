package com.example.business_card_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.business_card_kotlin.ui.theme.BusinesscardkotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardkotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Column {
        Header()
        Info()
    }
}

@Composable
fun Header() {
    Image(
        painter = painterResource(id = R.drawable.snowflake),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .size(150.dp)
    )
    Text(
        text = "iman shaterian".uppercase(),
        Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
    Text(
        text = "android developer".uppercase(),
        Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )

}

@Composable
fun Info() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        InfoIcon()
        InfoText("+0123456789")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        InfoIcon()
        InfoText("something@gmail.com")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        InfoIcon()
        InfoText("@place for id")
    }
}

@Composable
fun InfoIcon() {
    Image(
        painter = painterResource(id = R.drawable.snowflake),
        contentDescription = null,
        modifier = Modifier
            .height(46.dp)
            .padding(8.dp)
    )
}

@Composable
fun InfoText(info: String) {
    Text(
        text = info,
        modifier = Modifier
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinesscardkotlinTheme {
        Main()
    }
}