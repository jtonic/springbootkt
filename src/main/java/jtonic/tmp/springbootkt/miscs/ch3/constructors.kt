package jtonic.tmp.springbootkt.miscs.ch3

/**
 * Created by Antonel Ernest Pazargic on 11/07/2017.
 * @author Antonel Ernest Pazargic
 */


fun main(args: Array<String>) {
    val person1 = Person("Antonel", "Pazargic", 29)
    println(person1)
    val person2 = Person(firstName = "Irina", age = 0, lastName = " ")
    println(person2)
}

class Person(val firstName: String, val lastName: String, val age: Int?) {
    override fun toString(): String {
        return "$firstName, $lastName"
    }

    init {
        require(firstName.isNotBlank(), { "Invalid argument firstName" })
        require(lastName.isNotBlank(), { "Invalid argument lastName" })
        if (age != null) {
            require(age in 1..150, { "Invalid argument age" })
        }
    }
}


