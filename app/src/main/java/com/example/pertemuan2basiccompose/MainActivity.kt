package com.example.pertemuan2basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan2basiccompose.ui.theme.Pertemuan2BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan2BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    column(
        horizontalAligment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxsize
    ){
        Text(text = "Login", style = TextStyle(fontsize = 50.sp,
        fontWeight = fontWeight.Bold))

    }
    Text(text = "ini adalah halaman login")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan2BasicComposeTheme {
        Greeting("Android")
    }
}