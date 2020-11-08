package net.asifhossain.kotlinforjavadev.week2.standardcollections

fun main() {
    val set = hashSetOf(1, 7, 7, 53)
    val list = arrayListOf(1, 7, 7, 53)
    val map = hashMapOf(1 to "once", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)


    // JOIN to string
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))

    //
}