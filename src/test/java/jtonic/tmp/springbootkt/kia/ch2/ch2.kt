package jtonic.tmp.springbootkt.kia.ch2

import io.kotlintest.matchers.shouldBe
import org.junit.Test

class Ch2Test {

    @Test
    fun `test smart case`() {
        eval(Sum(Sum(Num(1), Num(4)), Num(2))) shouldBe 7
        eval(Num(10)) shouldBe 10
    }

    private fun eval(e: Expr): Int = when (e) {
        is Num -> {
            print("$e ")
            e.value
        }
        is Sum -> {
            val left = e.left
            val right = e.right
            print("$e ")
            eval(left) + eval(right)
        }
        else -> throw IllegalArgumentException("Unrecognized expression type")
    }
}

interface Expr
class Num(val value: Int) : Expr {
    override fun toString() = "Num($value)"
}

class Sum(val left: Expr, val right: Expr) : Expr {
    override fun toString() = "Sum($left, $right)"
}
