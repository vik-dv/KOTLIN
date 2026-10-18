package org.example

fun pr() {
    for (i in 1000 downTo 0) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}

fun main() {
    pr()
}
