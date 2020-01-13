package net.asifhossain.kotlinforjavadev.week2.loops

fun main() {
    println("\nIterating with inclusive range")
    for (i in 1..9) {
        print(i)
    }

    println("\nIterating with exclusive range")
    for (i in 1 until 9) {
        print(i)
    }

    println("\nIterating with step")
    for (i in 9 downTo 1 step 2) {
        print(i)
    }



}

