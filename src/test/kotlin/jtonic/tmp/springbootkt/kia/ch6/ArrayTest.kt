package jtonic.tmp.springbootkt.kia.ch6

import io.kotlintest.matchers.shouldBe
import org.junit.Test

class ArrayTest {

    @Test
    fun `test arrays`() {

        val numbers = arrayOf(0, 1, 2, 3, 4, 5)

        val numsAsString = numbers.indices.map { "$it: ${numbers[it] + 1}" }
        numsAsString[0] shouldBe "0: 1"
        numsAsString[1] shouldBe "1: 2"


        val chars = listOf("a", "b")
        val charsAsArray = chars.toTypedArray()

        chars shouldBe charsAsArray.toList()

        printElements(*charsAsArray)

    }

    private fun printElements(vararg elem: String) {
        println(elem)
    }

}
