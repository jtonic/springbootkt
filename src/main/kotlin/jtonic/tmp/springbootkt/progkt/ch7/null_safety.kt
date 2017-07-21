package jtonic.tmp.springbootkt.progkt.ch7

/**
 * Created by Antonel Ernest Pazargic on 20/07/2017.
 * @author Antonel Ernest Pazargic
 */


fun main(args: Array<String>) {

    val name: Any? = "antonel"

    val asString = name as? String
    val asInt = name as? Int

    println("name = $name")

    println("asString = ${asString}")
    println("asInt = ${asInt}")


}