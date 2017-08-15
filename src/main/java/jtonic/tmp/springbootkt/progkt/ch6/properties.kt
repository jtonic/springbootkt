package jtonic.tmp.springbootkt.progkt.ch6

/**
 * Created by Antonel Ernest Pazargic on 12/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val p = Person("  Antonel ")
    p.age = 47
    println("My age is ${p.age}")
    println("p.firstName = '${p.firstName}'")

    val p2 = Person()
    println("p2.firstName = ${p2.firstName}")
    println("p2 = $p2")

    val p3 = Person2("Irina", 27)
    println("p3.getAge() = ${p3.getAge()}")
    println("p3.getFirstName() = ${p3.getFirstName()}")

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
        set(value) {
            field = value
        }
    var firstName: String = ""
        get() = field
        set(value) {
            field = value.trim()
        }

    constructor(): this("Antonel Ernest")

    init {
        println("This is the primary constructor")
        this.firstName = firstName
    }

    override fun toString() = "$firstName, $age"
}

class Person2(firstName: String, age: Int) {
    private val firstName: String = firstName
    private val age: Int = age

    fun getFirstName() = this.firstName
    fun getAge() = this.age

}
