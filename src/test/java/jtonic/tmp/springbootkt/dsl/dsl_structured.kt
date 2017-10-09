package jtonic.tmp.springbootkt.dsl

/**
 * Created by Antonel Ernest Pazargic on 09/10/2017.
 * @author Antonel Ernest Pazargic
 */

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()

    protected fun <T: Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE: Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun main(args: Array<String>) {
    fun createTable1() =
            table {
                tr {
                    td {

                    }
                }
            }

    println(createTable1())

    fun createTable2() =
            table {
                for(i in 1..5) {
                    tr {
                        td {

                        }
                    }
                }
            }
    println(createTable2())
}


