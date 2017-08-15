package jtonic.tmp.springbootkt.koans.rangeto

import io.kotlintest.matchers.shouldBe
import jtonic.tmp.springbootkt.koans.MyDate
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

class RangeToTest {

    @Test
    fun testRange() {

        val start = MyDate(1969, 12, 20)
        val end = MyDate(1972, 11, 10)

        val date1 = MyDate(1970, 1, 29)
        val date2 = MyDate(1920, 1, 29)

        (date1 in start..end) shouldBe true
        (date2 !in start..end) shouldBe true
    }
}