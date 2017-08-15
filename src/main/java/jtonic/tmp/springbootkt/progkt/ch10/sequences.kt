package jtonic.tmp.springbootkt.progkt.ch10

/**
 * Created by Antonel Ernest Pazargic on 23/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(vararg args: String) {

    println(sequenceOf(1, 2, 3, 4).joinToString(", "))
    emptySequence<String>().forEach { println(it) }

    val seq = generateSequence(0) { it + 1 }
    seq.takeWhile { it < 5 }.forEach { println(it) }

    println("Consume the sequence again")
    seq.takeWhile { it < 3 }.forEach { println(it) }

    val numbers = listOf(1, 2, 3, 4, 5).asSequence()
    println(seq.javaClass.canonicalName)
    println(numbers.javaClass.canonicalName)

    var prevNumber = 0
    val fibonacci = generateSequence(1) {
        val tmp = prevNumber
        prevNumber = it
        it + tmp
    }

    println(fibonacci.take(4).joinToString (", "))


}