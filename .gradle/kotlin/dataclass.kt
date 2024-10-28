package com.example.test

data class DataClass(
val id: Int,
var email: string
)

fun main() {
val data = DataClass(1, "indra@gmail.com")
println(data)

val data2 = DataClass(1, "makan@gmail.com")
println(data == data2)

val data3 = data.copy()
println(data3)

val data4 = data.copy(email = "sahar@gmail.com")
println(data4)
}