package net.asifhossain.kotlinforjavadev.week2.exercise

import kotlin.math.min

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { it.first == it.second }
    val commonLetters = "ABCDEF".sumBy { ch -> min(secret.count { it == ch }, guess.count { it == ch }) }
    return Evaluation(rightPosition = rightPositions, wrongPosition = commonLetters - rightPositions)
}

fun main() {
    println(evaluateGuess(secret = "ABCD", guess = "EAAA"))
}
