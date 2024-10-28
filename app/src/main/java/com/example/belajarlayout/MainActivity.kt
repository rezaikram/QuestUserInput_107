@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.belajarlayout


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projekpernadapam.R

@Preview(showBackground = true)
@Composable

fun belajarlayout(
        modifier: Modifier = Modifier){
        Column(modifier = Modifier.fillMaxSize()){
HeaderSection()
                DetailMhs(
                        param = "Nama",
                        argu = "Joko"
                )
                DetailMhs(
                        param = "Nim",
                        argu  = "20220140107"
                )
                DetailMhs(
                        param = "Prodi",
                        argu = "Teknologi Informasi")
                DetailMhs(
                        param = "Fakultas",
                        argu = "Teknik")
                DetailMhs(
                        param = "Universitas",
                        argu = "Universitas Muhammadiyah Yogyakarta")
                DetailMhs(
                        param = "Email",
                        argu = "Jokoganteng@gmail.com")
        }
}
        @Composable
        fun HeaderSection() {
                Box(
                        modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.LightGray)
                ) {
                        Row(

                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp)
                        ){
                                Box(
                                        contentAlignment  = Alignment.BottomEnd
                                ) {
                                        Image(
                                                painter = painterResource(id = R.drawable.download),
                                                contentDescription = null,
                                                modifier = Modifier.clip(CircleShape)
                                        )
                                        Icon(
                                                Icons.Filled.Check,
                                                contentDescription = null,
                                                modifier = Modifier.size(30.dp)
                                        )
                                }
                                Column (
                                        modifier = Modifier.padding(14.dp)

                                        ) {
                                        DetailMhs(param = "Nama", argu = "Joko")
                                }
                                Text(text = "Teknologi informasi")
                                Text(text = "Universitas Muhammadiyah ")
                        }
                }
        }
@Composable
fun DetailMhs(param : String, argu : String){
    Column (
            modifier = Modifier.padding(16.dp)
            ){
            Row (
                    modifier =  Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
            ){
                    Text(text = "Nama",
                            modifier = Modifier.weight(0.8f))
                    Text(text = ":",
                            modifier = Modifier.weight(0.2f))
                    Text(text = "Joko",
                            modifier = Modifier.weight(2f))

            }
    }
}


