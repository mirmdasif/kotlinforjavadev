package net.asifhossain.kotlinforjavadev.week2.loops

fun main() {
    val list = listOf("a", "b", "c")

    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }
}