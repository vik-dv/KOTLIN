package org.example

import kotlin.system.exitProcess

fun iN (num: Int){
    println("number = " + num + "  FALSE")
    exitProcess(status = 0)
}
fun iY(num: Int){
    println("number = " + num + "  TRUE")
    exitProcess(status = 0)
}
fun iO(){
    println("This is = 0, Bye")
    exitProcess(status = 0)
}
fun main() {

        println("Введите число:")
        val num = readln()
    try {
        if (num.toInt() < 0) {
            iY(num.toInt())
        }
        if (num.toInt() > 0) {
            iN(num.toInt())
        }
        if (num.toInt() == 0) {
            iO()
        }
    }
    catch (e:NumberFormatException){
        println(e)
        println("Is not digit")
        exitProcess(status = 0)

    }

    }

