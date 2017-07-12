package jtonic.tmp.springbootkt.progkt.ch7

/**
 * Created by Antonel Ernest Pazargic on 12/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val desc = Executors::class.annotations.first() as Description
    println("Annotation description summary= ${desc.summary}")
}

annotation class Description(val summary: String)

@Description("This class creates Executor instances")
class Executors
