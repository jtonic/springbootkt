
package jtonic.tmp.springbootkt.progkt.ch4

/**
 * Created by Antonel Ernest Pazargic on 16/07/2017.
 * local and top-level functions
 * function literal
 * named and default parameters
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    tuples()
    f1()
    printArea(100, 2)
    greeting(name = "Tony")
    greeting()
    fizzbuzz(1, 16)
}

fun tuples() {
    println("======= Pair =========")
    val pair = "key" to "value"
    val (a, b) = pair
    println("pair = $pair")
    println("a = $a")
    println("b = $b")
    println("pair.first = ${pair.first}")
    println("pair.second = ${pair.second}")


    println("======= Triple =========")
    val triple = Triple("one", "two", "three")
    val (p, q, r) = triple
    println("triple = $triple")
    println("p = $p")
    println("q = $q")
    println("r = $r")

    println("triple.first = ${triple.first}")
    println("triple.second = ${triple.second}")
    println("triple.third = ${triple.third}")


    println("======= Tuple4 =========")
    println("Kotlin does not support TupleX because there is no meaning of the tuples fields")
    val fourth = Tuple4("one", "thow", "three", "four")
    val (c, d, e, f) = fourth

    println("fourth = $fourth")
    println("c = $c")
    println("d = $d")
    println("e = $e")
    println("f = $f")

}

data class Tuple4<out T, out U, out V, out Y>(val one: T, val two: U, val three: V, val four: Y)

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
