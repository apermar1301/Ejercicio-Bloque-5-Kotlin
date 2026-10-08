package com.github.apermar1301

fun main() {
    print(name(readlnOrNull()))
}

fun name(a: Any?): String {
    return when (a) {
        null -> "Nothing"
        is String -> "String"
        is Int -> when (a){
            in 1..3 -> "Small number"
            in 7..13 -> "Magic number"
            in 4..100 -> "Big number"
            else -> "Integer"
        }
        is Long -> "Integer"
        else -> "No idea"
    }
}