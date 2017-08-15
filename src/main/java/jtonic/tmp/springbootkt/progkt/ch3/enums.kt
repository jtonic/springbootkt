package jtonic.tmp.springbootkt.progkt.ch3

/**
 * Created by Antonel Ernest Pazargic on 20/07/2017.
 * @author Antonel Ernest Pazargic
 */
enum class Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum class Months(val _name: String, val days: Int) {
    JANUARY("January", 31),
    FEBRUARY("February", 28)
}

interface Printable {
    fun print(): Unit
}

enum class Word: Printable {
    HELLO {
        override fun print() {
            println("Hello world!!!")
        }
    },
    BYE {
        override fun print() {
            println("Bye world!!!")
        }
    }
}


fun main(args: Array<String>) {
    val friday = Week.FRIDAY

    println("Friday ${friday.name}")
    println("Saturday ${Week.SATURDAY.ordinal}")

    println("January ${Months.JANUARY._name} ${Months.FEBRUARY.days}")

    println("Word.HELLO.print() = ${Word.HELLO.print()}")
    println("Word.HELLO.print() = ${Word.HELLO.print()}")
}