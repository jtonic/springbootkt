package jtonic.tmp.springbootkt.progkt.ch10

import java.util.*

/**
 * Created by Antonel Ernest Pazargic on 23/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val words = arrayOf("jtonic", "the", "most", "exciting", "boy")
    println(words.joinToString(" ", prefix = "statement = (", postfix = ")"))
    val first = words[0]
    println("first is $first")

    val names = arrayOfNulls<String>(3)
    names[0] = "jtonic"
    names[1] = "Irina"
    names[2] = "Tutye"

    for (name in names) {
        println("name = $name")
    }

    var integers = emptyArray<Int>()
    integers += 1
    integers += 2
    println("integers count = ${integers.size}")

    val students = Array(3) { index ->
        when (index) {
            0 -> Student("Antonel Pazargic", age = 47)
            1 -> Student("Irina Stan", age = 25)
            else -> Student("Xxx")
        }
    }
    students.forEach { println(it) }
    println("Filtered list of students")
    students.takeWhile { it.age > 20 }.forEach { println(it) }
    println("Filtered list of students - 2")
    students.filterIndexed { idx, _ -> idx % 2 == 0 }.forEach { println(it) }


    val ints = intArrayOf(1, 2, 3)
    for (i in ints.indices) {
        println("For $i the value is ${ints[i]}")
    }

    val int = Random().nextInt(4)
    if (int in ints)
        println("The $int is in the int array")
    val items = ints.map { "Item $it" }
    println(items.joinToString(", "))

    println("flatMap=====")
    val chars = charArrayOf('a', 'b', 'c', 'd')
    val buffer = StringBuffer()
    chars.flatMap {charArrayOf(it, it, it).asIterable()}.joinTo(buffer, ",")
    println(buffer)
}


data class Student(val name: String, val age: Int = 18, val specialization: String = "IT")