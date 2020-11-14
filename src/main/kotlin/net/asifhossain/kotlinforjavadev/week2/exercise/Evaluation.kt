package net.asifhossain.kotlinforjavadev.week2.exercise;

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    var rightPosition = 0;
    var wrongPosition = 0;
    val secretChars = secret.toCharArray()
    val guessChars = guess.toCharArray()
    for (i in guessChars.indices) {
        if (guessChars[i] == secretChars[i]) {
            rightPosition++
            secretChars[i] = 'G'
            guessChars[i] = 'G'
        }
    }

    for (i in guessChars.indices) {
        if (guessChars[i] != 'G' && secretChars.contains(guessChars[i])) {
            wrongPosition++
            secretChars[secretChars.indexOf(guessChars[i])] = 'G'
        }
    }

    return Evaluation(rightPosition = rightPosition, wrongPosition = wrongPosition)
}

fun main() {
    println(evaluateGuess(secret = "ABCD", guess = "EAAA"))
}
