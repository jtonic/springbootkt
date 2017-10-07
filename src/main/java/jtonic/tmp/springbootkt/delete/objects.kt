package jtonic.tmp.springbootkt.delete

/**
 * Created by Antonel Ernest Pazargic on 07/10/2017.
 * @author Antonel Ernest Pazargic
 */

fun foo(msg: String) {
    println(msg)
}

fun main(args: Array<String>) {
    val obj = object {
        val a = 1
        val b = 2
    }
    println("obj[${obj.a}][${obj.b}]")

    foo("This is a message")
}
