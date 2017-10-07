package jtonic.tmp.springbootkt.delete

/**
 * Created by Antonel Ernest Pazargic on 07/10/2017.
 * @author Antonel Ernest Pazargic
 */
class Parent {

    val a = 10

    fun doSmth() {
        println("Do something")
    }
}

object Test {

    fun Parent.doSmth() {
        this.doSmth()
        println("doSmth extended")
    }

    fun Parent.doSmth(msg: String) {
        this.doSmth()
        println("doSmth with $msg")
    }

    fun Parent.doSmthElse() {
        println("Do smth else")
    }

    fun testExtentions() {
        val p = Parent()
        p.doSmth()
        p.doSmth("Antonel")
        p.doSmthElse()

        println("p.a = ${p.a}")
    }

}

val Parent.b: Int
    get() = this.a + 20

fun main(args: Array<String>) {
    println("parent property b = ${Parent().b}")
}
