package com.example.questbasiccomposable_107

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.projekpernadapam.R
import com.example.questbasiccomposable_107.ui.theme.QuestBasicComposable_107Theme

class MainActivity:ComponentActivity() {
    override fun onCreate(savedlnstanceState: Bundle?) {
        super.onCreate(savedlnstanceState)
        enableEdgeToEdge()
        setContent{
            QuestBasicComposable_107Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompos(
                        modifier =
                        Modifier.padding(innerPadding)
                    )
                    }
                }
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun BasicCompos(modifier: Modifier = Modifier) {
        //Text(text = "ini adalah text")
Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
){
    Text(
        text = "Login",
        style = TextStyle(
                fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
    ))
    Text(
        text = "gambar depan",
        style = TextStyle(
            fontSize = 15.sp,
            color = Color.Black,
        ))
    Image(painter = painterResource(id = R.drawable.download),
        contentDescription = null
    )//atau ""
Text(
    text = "Nama",
    style = TextStyle(
        fontSize = 15.sp,
        color = Color.Black,
    ))
    Text(
        text = "Muhammad Ikram Riza",
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color.Red,

        )
    Text(
        text = "2022014107",
        fontSize = 40.sp,
        color = Color.Black,

        )
    Image(painter = painterResource(id = R.drawable.foto),
    contentDescription = null
    )//atau""
}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hello name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_107Theme {
        Greeting("Android")
    }
}




