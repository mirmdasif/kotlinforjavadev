package net.asifhossain.kotlinforjavadev.week2.checksandranges


fun main() {
    println("a: ${isLetter('a')}")
    println("1: ${isLetter('1')}")

    println("a: ${isNotDigit('1')}")
    println("1: ${isLetter('1')}")

    println("1: ${recognize('1')}")
    println("b: ${recognize('b')}")
    println("&: ${recognize('&')}")
}

fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'

fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun recognize(ch: Char) = when (ch) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "Not alpha numeric"
}
