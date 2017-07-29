package jtonic.tmp.springbootkt.progkt.ch3

import java.util.*


open class AParent protected constructor() {
    open fun someMethod(): Int = Random().nextInt()
}

abstract class DDerived : AParent() {
    abstract override fun someMethod(): Int
}

class AlwaysOne : DDerived() {
    override fun someMethod() = 1
}

fun main(vararg args: String) {
    println(AlwaysOne().someMethod())
}

