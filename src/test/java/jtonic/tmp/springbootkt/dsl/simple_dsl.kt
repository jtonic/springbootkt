package jtonic.tmp.springbootkt.dsl

import io.kotlintest.matchers.shouldBe
import org.junit.Test
import java.time.temporal.ChronoUnit.HOURS
import java.time.temporal.ChronoUnit.MILLIS
import java.time.temporal.ChronoUnit.MINUTES
import java.time.temporal.ChronoUnit.SECONDS

object start

class StartWrapper(private val target: String, private val negate: Boolean = false) {
    infix fun with(with: String) = target.startsWith(with) || negate
}

infix fun String.must(start: start) = StartWrapper(this)
infix fun String.mustNot(start: start) = StartWrapper(this, true)

class TestDSLTest {

    @Test

    fun testMust() {
        "Antonel" must start with "Anto" shouldBe true
        "Antonel" must start with "Tut" shouldBe false

        "Antonel" mustNot start with "Tut" shouldBe true
    }

    @Test
    fun testDuration() {
        val minutesOfHour = 1 hours converted into MINUTES
        val secondsOfHour = 1 hours converted into SECONDS

        val millisOfHour = 1 hours converted into MILLIS


        val millisOfMinute = 1 minutes converted into MILLIS

        minutesOfHour shouldBe 60L
        secondsOfHour shouldBe 3600L
        millisOfHour shouldBe 3600000L

        millisOfMinute shouldBe 60_000L

        1 days converted into HOURS shouldBe 24L
        1 weeks converted into HOURS shouldBe 24 * 7L
    }
}