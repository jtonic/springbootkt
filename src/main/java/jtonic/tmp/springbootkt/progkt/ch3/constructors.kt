package jtonic.tmp.springbootkt.progkt.ch3

fun main(args: Array<String>) {
    val person1 = Person("Antonel", "Pazargic", 29)
    println(person1)

    val cat = Animal(name = "cat", speed = 40, height = 0.25)
    val dog = Animal(name = "dog", speed = 45, hairColor = "gray")
    println("cat = $cat")
    println("dog = $dog")

    val doc = MyDocument(size = 100, version = 2)
    print(doc)

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

    operator fun component1() = this.firstName
    operator fun component2() = this.lastName
    operator fun component3() = this.age
}

class Animal(val name: String, val hairColor: String = "Brown", val speed: Int = 30, val height: Double = 0.5) {
    override fun toString() = "Animal(name='$name', hairColor='$hairColor', speed=$speed, height=$height)"
}



