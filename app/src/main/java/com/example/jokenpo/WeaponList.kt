package com.example.jokenpo

data class Weapon(
    var id: Int = 0,
    var name: String = "",
    var winsTo: Int = 0,
    var losesTo: Int = 0
)

val Rock = Weapon(
    1,
    "Rock",
    3,
    2
)

val Paper = Weapon(
    2,
    "Paper",
    1,
    3
)

val Scissor = Weapon(
    3,
    "Scissor",
    3,
    2
)
