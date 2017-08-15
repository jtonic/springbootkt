package jtonic.tmp.springbootkt.progkt.ch3

import java.io.InputStream
import java.io.OutputStream

/**
 * Created by Antonel Ernest Pazargic on 13/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(args: Array<String>) {
    val stringUtils = StringUtils.create("Ronaldo")
    println("stringUtils.target = ${stringUtils.target}")
    println("StringUtils.create().target = ${StringUtils.create().target}")

    val client1 = Client("Antonel", "1234")
    println("client1 = $client1")
    val client2 = client1.copy(clientId = "135")
    println("client2 = $client2")

    val (name, clientId) = client1.copy(name = "Irina")
    println("name = $name")
    println("clientId = $clientId")

    val reversed = StringUtils.reverse("antonel")
    println("reversed = $reversed")

    val doc1: Document = MyDocument(200, 1)
    println(doc1.javaClass)
    println("doc1.description() = ${doc1.description()}")
}

data class Client(val name: String, val clientId: String)


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

class StringUtils private constructor(target: String) {

    var target: String = reverse(target)
        set(value) {
            field = reverse(value)
        }
        get

    init {
        this.target = reverse(target)
    }

    companion object {
        fun create(target: String) = StringUtils(target)
        fun create() = StringUtils("no target")
        fun reverse(str: String) = str.reversed()
    }
}