package net.asifhossain.kotlinforjavadev.week2.loops

fun main() {
    val map = mapOf(
            1 to "Asif",
            2 to "Prony",
            3 to "Liza",
            4 to "Tom"
    )

    for ((roll, name) in map) {
        println("Roll of $name is $roll")
    }
}