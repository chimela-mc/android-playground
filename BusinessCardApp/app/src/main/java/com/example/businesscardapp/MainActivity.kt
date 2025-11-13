package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.border(2.dp, Color.Red),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .background(color = Color.Black)
                    .border(2.dp, Color.Blue)
            )

            Text(
                text = "Chimela Chimela",
                modifier = Modifier.border(2.dp, Color.Blue),
                fontSize = 40.sp,
                //            fontWeight = FontWeight.Bold
            )
            Text(
                text = "Product & Software Developer",
                modifier = Modifier.border(2.dp, Color.Blue),
                color = Color(0xFF3ddc84),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier.border(2.dp, Color.Red)
        ) {
            Row {
//                Image(
//
//                )
                Text(
                    text = "@chimela-mc",
                    modifier = Modifier.border(2.dp, Color.Blue)
                )
            }
            Row {
//                Image(
//
//                )
                Text(
                    text = "@chimela-mc",
                    modifier = Modifier.border(2.dp, Color.Blue)
                )
            }
            Row {
//                Image(
//
//                )
                Text(
                    text = "@chimela_mc",
                    modifier = Modifier.border(2.dp, Color.Blue)
                )
            }
        }
    }
}

//
//@Composable
//fun Contact(modifier: Modifier = Modifier){
//
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting()
    }
}