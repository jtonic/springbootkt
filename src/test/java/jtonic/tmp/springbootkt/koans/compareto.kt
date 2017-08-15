package jtonic.tmp.springbootkt.koans

import io.kotlintest.matchers.shouldBe
import org.junit.Test

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

class CompareTest {

    @Test
    fun testCompare() {
        val date1 = MyDate(2011, 1, 21)
        val date2 = MyDate(2010, 2, 22)
        val recent1 = date1 > date2
        recent1 shouldBe true

        compare(date1, date2) shouldBe false
    }
}

