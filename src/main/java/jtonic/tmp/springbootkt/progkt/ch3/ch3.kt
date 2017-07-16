package jtonic.tmp.springbootkt.progkt.ch3

import java.io.InputStream
import java.io.OutputStream

/**
 * Created by Antonel Ernest Pazargic on 13/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val doc1: Document = MyDocument(200, 1)
    println(doc1.javaClass)
    println("doc1.description() = ${doc1.description()}")
}

interface Document {
    var size: Long
    val name: String
        get() = "No name"
    var version: Long

    fun save(`in`: InputStream)
    fun load(os: OutputStream)

    fun description() = "$name v.$version"
}

class MyDocument(override var size: Long, override var version: Long) : Document {
    override fun save(`in`: InputStream) {
        println("Saving the document...")
    }

    override fun load(os: OutputStream) {
        println("Loading the document...")
    }
}

fun print(doc: Document) = println(doc.description())