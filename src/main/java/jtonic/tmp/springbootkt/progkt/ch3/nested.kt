package jtonic.tmp.springbootkt.progkt.ch3

import io.kotlintest.matchers.Matcher
import io.kotlintest.matchers.Result
import io.kotlintest.matchers.beGreaterThan
import io.kotlintest.matchers.should
import javax.swing.JButton

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

    Controller().assert()
}

class Controller {
    private var clicks: Int = 10

    fun enableHook() {
        val button: JButton = JButton()
        button.addActionListener({ println("click it!!!!"); clicks++ })
    }

    fun assert() {
        clicks should beGreaterThan(1)
        clicks should {
            when {
                it > 0 -> Result(true, "OK")
                else -> Result(false, "Should be positive")
            }
        }
    }
}

class IntMatcher : Matcher<Int> {
    override fun test(value: Int): Result {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}