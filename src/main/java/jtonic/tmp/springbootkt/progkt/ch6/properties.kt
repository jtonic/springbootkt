package jtonic.tmp.springbootkt.progkt.ch6

/**
 * Created by Antonel Ernest Pazargic on 12/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val p = Person()
    p.age = 47
    println("My age is ${p.age}")

}

class Person {
    private var _age: Int? = null

    var age: Int?
        get() = _age
        set(value) {_age = value}

    init {
        println("This is the primary constructor")
    }
}