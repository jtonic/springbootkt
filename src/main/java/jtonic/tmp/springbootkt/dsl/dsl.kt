package jtonic.tmp.springbootkt.dsl

import java.time.Duration
import java.time.temporal.ChronoUnit
import java.time.temporal.ChronoUnit.HOURS
import java.time.temporal.ChronoUnit.MILLIS
import java.time.temporal.ChronoUnit.MINUTES
import java.time.temporal.ChronoUnit.NANOS
import java.time.temporal.ChronoUnit.SECONDS

/**
 * Created by Antonel Ernest Pazargic on 04/10/2017.
 * @author Antonel Ernest Pazargic
 */
object converted

class ConvertedWrapper(private val fromTemporalAmount: Duration) {
    infix fun into(toChronoUnit: ChronoUnit): Long =
            when (toChronoUnit) {
                HOURS -> fromTemporalAmount.toHours()
                MINUTES -> fromTemporalAmount.toMinutes()
                SECONDS -> fromTemporalAmount.toMinutes() * 60
                MILLIS -> fromTemporalAmount.toMillis()
                NANOS -> fromTemporalAmount.toNanos()
                else -> throw IllegalArgumentException("Unsupported chrono unit to convert period into")
            }
}

infix fun Int.weeks(to: converted) = ConvertedWrapper(Duration.ofDays(this * 7L))
infix fun Int.days(to: converted) = ConvertedWrapper(Duration.ofDays(this.toLong()))

infix fun Int.hours(to: converted) = ConvertedWrapper(Duration.ofHours(this.toLong()))
infix fun Int.minutes(to: converted) = ConvertedWrapper(Duration.ofMinutes(this.toLong()))
infix fun Int.seconds(to: converted) = ConvertedWrapper(Duration.ofSeconds(this.toLong()))
infix fun Int.millis(to: converted) = ConvertedWrapper(Duration.ofMillis(this.toLong()))
infix fun Int.nanos(to: converted) = ConvertedWrapper(Duration.ofNanos(this.toLong()))