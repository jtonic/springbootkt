package jtonic.tmp.springbootkt.progkt.ch10

/**
 * Created by Antonel Ernest Pazargic on 23/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {

    val numbers1 = setOf(1, 3, 1, null, 3, 5)
    val numbers2 = hashSetOf(3, 4, 1, 2, null)
    numbers2.add(10)
    numbers2.remove(null)
    println("numbers1 = $numbers1")
    println("numbers2 = $numbers2")

    println("Antonel is the best".asIterable().joinToString(", "))

    val carManufacturers1 = linkedSetOf("bwm", "skoda", "lamborgini", "mercedes")
    val carManufacturers2: Set<String> = mutableSetOf("bwm", "skoda", "lamborgini", "mercedes")
    carManufacturers1 += "fiat"
    println("carManufacturers1 = $carManufacturers1")
//    carManufacturers2 += "ford" // this doesn't compile

}