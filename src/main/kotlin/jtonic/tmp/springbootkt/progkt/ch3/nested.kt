package jtonic.tmp.springbootkt.progkt.ch3

/**
 * Created by Antonel Ernest Pazargic on 26/07/2017.
 * @author Antonel Ernest Pazargic
 */


class BasicGraph(val name: String) {

    private val graphName: String = name

    inner class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2:$y2) in graph named: $graphName")
            this@BasicGraph.draw()
        }
    }
    fun draw(): Unit {
        println("Drawing the graph $name")
    }
}

fun main(args: Array<String>) {
    val line = BasicGraph("Basic graph").Line(1, 0, -2, 0)
    line.draw()
}