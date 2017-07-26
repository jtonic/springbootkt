package jtonic.tmp.springbootkt.progkt.ch8

import java.util.*

/**
 * Created by Antonel Ernest Pazargic on 25/07/2017.
 * @author Antonel Ernest Pazargic
 */

interface Listener<in T> {
    fun onNext(t: T): Unit
}

class EventStream<in T> (private val listener: Listener<T>) {
    fun start(): Unit = println("Started ${listener.javaClass.typeName}")
    fun stop(): Unit = println("Stopped ${listener.javaClass.typeName}")
}

fun main(vararg args: String) {
    val loggingListener = object: Listener<Any> {
        override fun onNext(t: Any) {
            println("Event received: $t.")
        }
    }
    val loggingStream = EventStream<String>(loggingListener)
    loggingStream.start()

    val dateStream = EventStream<Date>(loggingListener)
    dateStream.start()

    val error = error("An unrecoverable error occurred!!!")

}
