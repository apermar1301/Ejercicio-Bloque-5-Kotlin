package com.github.apermar1301

// repasar
fun main() {
    val height = 5

    for (i in 1..height) {

        for (space in height - i downTo 0) {
            print(" ")
        }

        when {
            i != 1 -> {
                for (line in 1..i * 2 - 1) {
                    print("*")
                }
            }
            else-> {
                for (line in 1..i) {
                    print("*")
                }
            }
        }

        println()
    }
}