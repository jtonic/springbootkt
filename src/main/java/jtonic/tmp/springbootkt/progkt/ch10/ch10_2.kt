package jtonic.tmp.springbootkt.progkt.ch10

import java.math.BigDecimal
import java.util.*

/**
 * Created by Antonel Ernest Pazargic on 23/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val longs = longArrayOf(1, 2, 1, 2, 3, 4, 5, 6)
    val list = longs.toList()
    val hashSet = longs.toHashSet()
    val sortedSet = longs.toSortedSet()

    println("${hashSet.javaClass.canonicalName} - ${hashSet.joinToString(", ")}")
    println("${list.javaClass.canonicalName} - ${list.joinToString(", ")}")
    println("${sortedSet.javaClass.canonicalName} - ${sortedSet.joinToString(", ")}")

    val mutableList = longs.toMutableList()
    mutableList += 10
    println("${mutableList.javaClass.canonicalName} - ${mutableList.joinToString(", ")}")

    val (a, b, c) = list
    println("$a, $b, $c")

    println(listOfNotNull(null, "a", "b", "z", "p", "d", "t", null).joinToString(", "))

    val cartoonCharacters = mutableListOf("Jerry", "Tom", "Bugs Bunny", "Pluto", "Chip and Dale")
    println("cartoonCharacters.joinToString(\", \") = ${cartoonCharacters.joinToString(", ")}")
    cartoonCharacters += setOf("Johny Bravo", "Dexter")
    println("cartoonCharacters.joinToString(\", \") = ${cartoonCharacters.joinToString(", ")}")

    val emptyList = emptyList<String>()
    println("emptyList.javaClass.canonicalName = ${emptyList.javaClass.canonicalName}")

    val lst2 = listOf("a", "b")
    println("${lst2.javaClass.canonicalName} - ${lst2.joinToString(", ")}")

    (lst2 as AbstractList)[0] = "c"
    println("lst2.joinToString(\", \") = ${lst2.joinToString(", ")}")

    lst2.zip(listOf(1, 2, 3, 4)).forEach { println("${it.first}, ${it.second}") }

    val acc = StringBuilder()
    cartoonCharacters.fold(acc) {acc, s -> acc.append("$s, ") }
    println(acc)

    val prices = listOf(100, 200, 300, 400)
    println(prices.fold(BigDecimal.ZERO) { acc, i -> acc + i })

    val names = listOf("Tony", "Irina", "Roxana")
    val namesAsArray = names.toTypedArray()

    val chars = listOf('a', 'b', 'c')
    val charArray = chars.toCharArray()
    for (char in charArray) {
        println(char)
    }

}

operator fun BigDecimal.plus(i: Int) = this + BigDecimal(i)