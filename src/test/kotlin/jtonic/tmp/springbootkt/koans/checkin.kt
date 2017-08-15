package jtonic.tmp.springbootkt.koans.checkin

import io.kotlintest.matchers.shouldBe
import jtonic.tmp.springbootkt.koans.MyDate
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(myDate: MyDate) = start <= myDate && myDate <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

class TestIn {
    @Test
    fun testCheckInd() {
        val start = MyDate(2011, 1, 23)
        val endInclusive = MyDate(2011, 2, 20)

        val myDate1 = MyDate(2011, 1, 24)
        val myDate2 = MyDate(2011, 2, 20)
        val myDate3 = MyDate(2011, 2, 21)

        (myDate1 in DateRange(start, endInclusive)) shouldBe true
        (myDate2 in DateRange(start, endInclusive)) shouldBe true
        (myDate3 !in DateRange(start, endInclusive)) shouldBe true
    }
}
