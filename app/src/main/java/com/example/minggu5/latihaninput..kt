package com.example.minggu5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun LatihanInput() {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelp by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("")}

    var dataGender = listOf("Laki-Laki", "Perempuan")

    var confNama by remember { mutableStateOf("") }
    var confEmail by remember { mutableStateOf("") }
    var confAlamat by remember { mutableStateOf("") }
    var confNotelp by remember { mutableStateOf("") }
    var confGender by remember { mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = nama,
            onValueChange = { nama = it },
            label = {
                Text(text = "nama")
            },
            placeholder = {
                Text(text = "nama")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
       Row(modifier = Modifier.fillMaxWidth()){
           dataGender.forEach{selectedGender->
               Row(verticalAlignment = Alignment.CenterVertically) {
                   RadioButton(
                       selected = gender == selectedGender,
                       onClick = {gender = selectedGender}
                   )
                   Text(text = selectedGender)}
           }
       }
        TextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(text = "email")
            },
            placeholder = {
                Text(text = "email")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        TextField(
            value = alamat,
            onValueChange = { alamat = it },
            label = {
                Text(text = "alamt")
            },
            placeholder = {
                Text(text = "alamat")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        TextField(
            value = notelp,
            onValueChange = { notelp = it },
            label = {
                Text(text = "notelp")
            },
            placeholder = {
                Text(text = "notelp")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        Button(onClick = {
            confNama = nama
            confEmail = email
            confAlamat = alamat
            confNotelp = notelp
            confGender = gender
        }) {
            Text(text = "Simpan")
        }
        Tampildata(param = "nama", argu = confNama)
        Tampildata(param = "email", argu = confEmail)
        Tampildata(param = "alamat", argu = confAlamat)
        Tampildata(param = "notelp", argu = confNotelp)
        Tampildata(param = "Gender", argu = confGender)
    }
}

@Composable
fun Tampildata(param : String, argu : String){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier =  Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))

        }
    }
}

