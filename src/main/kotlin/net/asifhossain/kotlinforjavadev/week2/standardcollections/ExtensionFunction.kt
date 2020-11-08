package net.asifhossain.kotlinforjavadev.week2.standardcollections

import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    println("Hello, ${args.getOrNull(0)}!")

    // JOIN to string
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))

    // getOrNull for lists
    val list = listOf("abc")
    println(list.getOrNull(0))
    println(list.getOrNull(1))

    // Extension function: withIndex()
    val list2 = listOf("a", "b", "c")

    for ((index, element) in list2.withIndex()) {
        println("$index $element")
    }

    // Extension function until
    println(1.until(10).toString())

    println(1 same -1)
    println(1 same -2)

    println('a'.isLetter())

    // Extension function for string
    val string1 = """To code
        or not to code?.."""
    println(string1)

    val string2 = """To code
        or not to code?..""".trimMargin().trimIndent()
    println(string2)


    val regex = """\d{2}\.\d{2}.\d{4}""".toRegex()

    println(regex.matches("01.01.1992"))

    // Conversion to numbers
    println("1234".toInt())
    println("12.20".toDouble())

    println("abc".toIntOrNull())

    "abc" eq "xyz"
    "abc" eq "abc"

}

private infix fun <T> T.eq(other: T) {
    if (this == other) println("OK: $this == $other")
    else println("Error: $this != $other")
}

infix fun Int.same(other: Int): Boolean {
    return this.absoluteValue == other.absoluteValue
}
