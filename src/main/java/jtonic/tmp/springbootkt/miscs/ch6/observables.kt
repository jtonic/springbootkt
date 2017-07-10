package jtonic.tmp.springbootkt.miscs.ch6

import kotlin.properties.Delegates

/**
 * Created by Antonel Ernest Pazargic on 10/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun printit(msg: String) = println(msg)

fun main(args: Array<String>) {
    printit("jtonic")

    val prop = WithObservableProp()
    println("prop.value = ${prop.value}")
    prop.value = 100
    println("prop.value = ${prop.value}")

    val nnProp = NonNullableProp()
    // println("nnProp.value = ${nnProp.value}") // This will throw a IllegalStateException
    nnProp.value = 100
}


class WithObservableProp {
    var value: Int by Delegates.observable(0) {property, oldValue, newValue ->
        println("The value has been changed from $oldValue to $newValue")
    }
}

class NonNullableProp {
    var value: Int by Delegates.notNull<Int>()
}

