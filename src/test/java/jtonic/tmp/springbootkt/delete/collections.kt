package jtonic.tmp.springbootkt.delete

import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 26/09/2017.
 * @author Antonel Ernest Pazargic
 */

class CollectionsMutabilityTest {

    @Test
    fun `simple test`() {
        val cities1 = setOf("Bucharest", "Madrid", "Paris", "Bonn", "Munich")
        val cities2 = mutableSetOf("Bucharest", "Madrid", "Paris", "Bonn", "Munich")
        // cities1 += "London"   // this does not compile
        cities2 += "London"

        println(cities1.joinToString())
        println(cities2.joinToString())

        (cities1 as HashSet) += "Berlin"
        println(cities1.joinToString())
    }
}