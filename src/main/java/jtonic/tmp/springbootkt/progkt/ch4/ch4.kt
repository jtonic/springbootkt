
package jtonic.tmp.springbootkt.progkt.ch4

/**
 * Created by Antonel Ernest Pazargic on 16/07/2017.
 * local and top-level functions
 * function literal
 * named and default parameters
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    f1()
    printArea(100, 2)
    greeting(name = "Tony")
    greeting()
    fizzbuzz(1, 16)
}

val f1 = {println("This is a function literal")}

fun printArea(width: Int, height: Int): Unit {
    fun calculateArea() = width * height
    val area = calculateArea()
    println("The area is $area")

}

fun fizzbuzz(start: Int, end: Int): Unit {
    for (k in start..end) {
        fun isFizz() = k % 3 == 0
        fun isBuzz() = k % 5 == 0
        when {
            isFizz() && isBuzz() -> println("Fizz Buzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> println(k)
        }
    }
}

fun greeting(name: String = "no name") = println("Hello $name!!!")
