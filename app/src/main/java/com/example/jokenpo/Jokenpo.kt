package com.example.jokenpo

fun main() {

    var playerChoice: Weapon
    var isInputValid = false

    val randomNumber = (1..3).random()

    println("Jokenpo! Your choice will be: ")

    while (!isInputValid) {
        isInputValid = true
        playerChoice = when (readln().lowercase()) {
            Rock.id.toString() -> Rock
            Paper.id.toString() -> Paper
            Scissor.id.toString() -> Scissor
            Rock.name.lowercase() -> Rock
            Paper.name.lowercase() -> Paper
            Scissor.name.lowercase() -> Scissor
            else -> {
                println("\nPlease write 'Rock, Paper or Scissor' or a number 1, 2 or 3 respectively to confirm your choice")
                println("Try Again:")
                isInputValid = false
                Weapon()
            }
        }
    }

    var computerChoice: Any = when (randomNumber) {
        1 -> Rock
        2 -> Paper
        3 -> Scissor
        else -> {}
    }


}
