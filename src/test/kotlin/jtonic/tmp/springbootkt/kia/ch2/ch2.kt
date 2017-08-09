package jtonic.tmp.springbootkt.kia.ch2

import io.kotlintest.matchers.shouldBe
import org.junit.Test

class Ch2Test {

    @Test
    fun `test smart case`() {
        val e: Expr = Sum(Sum(Num(1), Num(4)), Num(2))

        eval(e) shouldBe 7
    }

    private fun eval(e: Expr): Int = when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unrecognized expression type")
    }
}

interface Expr
class Num(val value: Int) : Expr {
    override fun toString() = value.toString()
}

class Sum(val left: Expr, val right: Expr) : Expr {
    override fun toString() = "sum of $left and $right"
}
