package jtonic.tmp.springbootkt.progkt.ch3

import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths

interface IPersistable {
    fun save(stream: InputStream)
}

interface IPrintable {
    fun print()
}

abstract class Document1(val title: String)

class TextDocument(title: String) : IPersistable, Document1(title), IPrintable {
    override fun print() {
        println("print the title $title")
    }

    override fun save(stream: InputStream) {
        println("saving the document $title")
    }

    fun backup() {
        println("Backing up the document $title...")
        Files.createFile(Paths.get("$title.txt")).toFile().inputStream()
                .use { save(it) }
        println("The document has been successfully backed up")
    }
}

fun main(vararg args: String) {
    val textDocument = TextDocument("Antonel")
    val printable: IPrintable = TextDocument("my document")
    val persistable: IPersistable = textDocument
    val document = TextDocument("Irina")
    val document1 = textDocument

    printable.print()
    textDocument.backup()
}
