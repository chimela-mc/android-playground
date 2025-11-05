package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IntroPage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun IntroPage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = stringResource(R.string.paragraph_one),
            modifier = Modifier.padding (start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.paragraph_two),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherAppTheme {
        IntroPage()
    }
}