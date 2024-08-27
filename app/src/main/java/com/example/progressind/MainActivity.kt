package com.example.progressind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.progressind.ui.theme.ProgressindTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProgressindTheme {
             Surface(
                 modifier = Modifier.fillMaxSize(),
                 color = MaterialTheme.colorScheme.background

             ) {
                 ProgressIndExample()

             }
                }
            }
        }
    }


@Composable
fun ProgressIndExample(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(50.dp)
    ){
//        LinearProgressIndicator(
//            modifier = Modifier
//                .height(18.dp)
//                .fillMaxWidth()
//                .background(
//                    Color.LightGray
//                ),
//            color = Color.Red
//        )
        CircularProgressIndicator(
            modifier = Modifier.size(150.dp),
            color=Color.Blue,
            strokeWidth = 10.dp,
            progress=0.5f
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProgressindTheme {

    }
}