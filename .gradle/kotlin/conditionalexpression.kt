package  com.example.test

fun ConditionalStatement() {
    println("=== Conditional Expression ===")

    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }

    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatExpectaion) {
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    do {
        printl("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main() {
conditionalStatement()
Perulangan()
}