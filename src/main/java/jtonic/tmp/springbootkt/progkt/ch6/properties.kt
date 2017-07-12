package jtonic.tmp.springbootkt.progkt.ch6

import jtonic.tmp.springbootkt.progkt.ch3.Person

/**
 * Created by Antonel Ernest Pazargic on 12/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val p = Person("  Antonel ")
    p.age = 47
    println("My age is ${p.age}")
    println("p.firstName = '${p.firstName}'")

    val multilineStr = """
        this is
        a multiline
        string
    """
    println(multilineStr)
}

class Person constructor(firstName: String) {
    var age: Int = 1
        get() = field
        set(value) {field = value}
    var firstName: String = ""
        get() = field
        set(value) {field = value.trim()}



    init {
        println("This is the primary constructor")
        this.firstName = firstName
    }
}