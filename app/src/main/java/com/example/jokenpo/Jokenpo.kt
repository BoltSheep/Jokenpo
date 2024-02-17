package com.example.jokenpo

fun main() {

    var continuePlaying: String
    var stopPlaying = false
    var playerChoice = Weapon()

    while (!stopPlaying) {
        var isInputValid = false

        val randomNumber = (1..3).random()

        println("Jokenpo! Your choice will be? ")

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

        val computerChoice: Weapon = when (randomNumber) {
            1 -> Rock
            2 -> Paper
            3 -> Scissor
            else -> {
                Weapon()
            }
        }

        println("the computer chose: ${computerChoice.name} so...")

        if (playerChoice == Rock) {
            if (computerChoice == Paper) {
                println("\t\tYOU LOSE!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else if (computerChoice == Scissor) {
                println("\t\tYOU WON!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else {
                println("\t\tIT`S A DRAW")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            }
        }
        if (playerChoice == Paper) {
            if (computerChoice == Scissor) {
                println("\t\tYOU LOSE!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else if (computerChoice == Rock) {
                println("\t\tYOU WON!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else {
                println("\t\tIT`S A DRAW")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            }
        }
        if (playerChoice == Scissor) {
            if (computerChoice == Paper) {
                println("\t\tYOU LOSE!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else if (computerChoice == Paper) {
                println("\t\tYOU WON!")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            } else {
                println("\t\tIT`S A DRAW")
                println("Play Again? (Y/N)")
                continuePlaying = readln().lowercase()
                stopPlaying = if (continuePlaying == "y" || continuePlaying == "yes") {
                    false
                } else {
                    println("\nOk, Bye")
                    true
                }
            }
        }
    }
}
