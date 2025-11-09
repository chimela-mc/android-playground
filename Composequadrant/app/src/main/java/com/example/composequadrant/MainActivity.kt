package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrant(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.text_compose_head),
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.text_compose_body),
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.image_compose_head),
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.image_compose_body),
                )
            }
        }

        Row(
            modifier = Modifier.weight(1f)

        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.row_compose_head),
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.row_compose_body),
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.column_compose_head),
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.column_compose_body),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}