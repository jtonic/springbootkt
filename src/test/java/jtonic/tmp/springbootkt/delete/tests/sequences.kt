package jtonic.tmp.springbootkt.delete.tests

import org.junit.Test
import kotlin.streams.toList

/**
 * Created by Antonel Ernest Pazargic on 26/09/2017.
 * @author Antonel Ernest Pazargic
 */

class SequencesTest {
    @Test
    fun `simple tests`() {
        val listOfCities = setOf("Bucharest", "Madrid", "Paris", "Bonn", "Munich")

        val cities = listOfCities.asSequence()
        cities.filter { it.startsWith("B") }
                .map { it.toUpperCase() }
                .forEach { print(it) }

        println()

        cities.filter { it.startsWith("M") }.joinToString().println()

        println()

        listOfCities.stream().filter { it.startsWith("M") }.toList().joinToString().println()
    }
}

private fun CharSequence.println() {
    println(this)
}
