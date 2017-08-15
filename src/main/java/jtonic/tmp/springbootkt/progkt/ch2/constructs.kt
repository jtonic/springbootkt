package jtonic.tmp.springbootkt.progkt.ch2

import jtonic.tmp.springbootkt.progkt.ch3.Person

fun main(vararg args: String) {

    println("isOneOrZero(0) = ${isOneOrZero(0)}")
    println("isOneOrZero(2) = ${isOneOrZero(2)}")
    println("isOneOrZero(null) = ${isOneOrZero(null)}")

    println("isDigit(9) = ${isDigit(9)}")
    println("isDigit(11) = ${isDigit(11)}")

    println("startWithFoo(\" jtonic \") = ${startWithFoo("jtonic")}")
    println("startWithFoo(\" foojtonic \") = ${startWithFoo("foojtonic")}")

    val person = Person("Antonel", "Pazargic", age = 47)
    println("person.fullName = ${person.fullName}")
    println(getFirstName(person))
    printFirstName(person)

    val ligia = Child("Ligia", "Pazargic", 3)
    println(getChildAge(ligia))

    val octav = getChildFromFullName("Octav, Pazargic")
    println(octav)

    val fivePoints = getScore(5)
    val onePoint = getScore(0)
    val tenPoints = getScore(11)

    println("fivePoints = $fivePoints")
    println("onePoint = $onePoint")
    println("tenPoints = $tenPoints")

    val humans: List<Any> = listOf(person, ligia, octav!!)

    val children = getChildren(humans) as MutableList
    println("children = $children")

    val gypsyChild = Child("Mercedes", age = 10)

    children += gypsyChild

    println("children = $children")
    val fullyNamedChildren = children.mapNotNull { it.lName }
    println("fullyNamedChildren = $fullyNamedChildren")

}

fun isOneOrZero(i: Int?) = when (i) {
    0, 1 -> true
    else -> false
}

fun isDigit(i: Int) = when (i) {
    in -9..9 -> true
    else -> false
}

fun startWithFoo(a: Any) = when (a) {
    is String -> a.startsWith("foo")
    else -> false
}

fun getFirstName(p: Person?): String {
    val fName = p?.firstName ?: throw IllegalArgumentException("Null person :(((")
    return fName
}

// extension property
val Person.fullName: String get() = "$firstName $lastName"

fun printFirstName(p: Person) {
    val (fName, _) = p
    println("fName = $fName")

}

fun getChildAge(child: Child): Int {
    val (_, _, age) = child
    return age
}

fun getChildFromFullName(fullName: String) =
        if (',' in fullName) {
            val (fName, lName) = fullName.split(',')
            Child(fName.trim(), lName.trim())
        } else
            null

fun getScore(score: Int) =
        score.coerceIn(1..10)

data class Child(val fName: String, val lName: String? = null, val age: Int = 5)

fun getChildren(persons: List<Any>) = persons.filterIsInstance<Child>()
