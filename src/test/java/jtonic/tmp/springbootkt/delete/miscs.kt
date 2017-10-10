package jtonic.tmp.springbootkt.delete

import io.kotlintest.matchers.beOfType
import io.kotlintest.matchers.should
import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 07/10/2017.
 * @author Antonel Ernest Pazargic
 */

class MiscTest {

    @Test
    fun `first for empty list`() {

        val lst = mutableListOf<Int>()
        val first = lst.firstOrNull()
        println("first = $first")

        firstPositive(lst)
        lst += -1
        firstPositive(lst)
        lst += listOf(1, 10)
        firstPositive(lst)
    }

    @Test
    fun `lambda with receiver`() {
        val receiver: StringBuilder.() -> Unit = { append("Antonel")}
        val sb = StringBuilder()
        sb.receiver()
        sb.toString() shouldBe "Antonel"
    }

    @Test
    fun `with lambda with receiver`() {
        val exp = StringBuilder("Antonel").run {
            append(" este ")
            append("un destept")
            toString()
        }

        exp should  beOfType<String>()
        exp shouldBe "Antonel este un destept"
    }

    @Test
    fun `zip and filter`() {
        val l1 = listOf("1", "2", "3")
        val l2 = listOf("on", "off", "on")
        printFirstForCondition(l1, l2, "on")
        printFirstForCondition(l1, l2, "off")
        printFirstForCondition(l1, l2, "stopped")
    }

    @Test
    fun `higher order function`() {

        fun higherOrder(exec: () -> String) = exec()

        fun exec() = "This is mine"

        higherOrder(::exec) shouldBe "This is mine"
        higherOrder { "This is yours" } shouldBe "This is yours"

    }

    @Test
    fun `lambda expression`() {
        val sum1 = { x: Int, y: Int -> x + y }
        sum1(1, 1) shouldBe 2

        val sum2: (Int, Int) -> Int = { a, b -> a + b }
        sum2(2, 2) shouldBe 4

        val sum3 = fun(a: Int, b: Int) = a + b
        sum3(3, 3) shouldBe 6
    }

    @Test
    fun `destructuring`() {
        val lst = mutableListOf(1, 2, 3, 4)
        val (_, second, third) = lst
        println("second: $second, third: $third")

        val (first) = lst
        first shouldBe 1

        lst.single { it == 2 } shouldBe 2
        lst.singleOrNull { it >= 2 } shouldBe null

        val exc = shouldThrow<IndexOutOfBoundsException> {
            val (fst: Int) = emptyList<Int>()
            fst
        }
        exc.message shouldBe "Empty list doesn't contain element at index 0."
    }

    private fun printFirstForCondition(l1: List<String>, l2: List<String>, criterion: String) {
        val key1 = l1.zip(l2).firstOrNull { it.second == criterion }?.first ?: "n/a"
        println("key1 = $key1")
        val key2 = l1.zip(l2).firstOrNull { it.second == criterion }?.first ?: throw NoSuchElementException("Condition not met")
        println("key2 = $key2")
    }

    private fun firstPositive(lst: MutableList<Int>) {
        val firstPositive = lst.firstOrNull { it > 0 }
        println("firstPositive = $firstPositive")
    }
}