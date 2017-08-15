package jtonic.tmp.springbootkt.progkt.ch3

import java.lang.reflect.Modifier

open class Container {
    open protected val fieldA: String = "Some value"
}

class DerivedContainer: Container() {
    public override val fieldA: String = "Something else"
}

fun main(vararg args: String) {
    val derivedContainer = DerivedContainer()
    println("derivedContainer.fieldA = ${derivedContainer.fieldA}")

    val container: Container = Container()

    println("Fields of the container class")
    container.javaClass.fields.forEach { println(it) }
    println("Declared fields of the container")
    val dFields = container.javaClass.declaredFields
    dFields.forEach { println(it) }
    dFields.forEach {
        it.isAccessible = true
        println("Field: ${it.name}, ${Modifier.toString(it.modifiers)}, value = ${it.get(container)}")

    }
}