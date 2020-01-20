package net.asifhossain.kotlinforjavadev.week2.checksandranges


fun main() {
    println("a: ${isLetter('a')}")
    println("1: ${isLetter('1')}")

    println("a: ${isNotDigit('1')}")
    println("1: ${isLetter('1')}")
}

fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'

fun isNotDigit(ch: Char) = ch !in '0'..'9'
