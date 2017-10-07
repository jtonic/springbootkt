package jtonic.tmp.springbootkt.delete

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
    fun `zip and filter`() {
        val l1 = listOf("1", "2", "3")
        val l2 = listOf("on", "off", "on")
        printFirstForCondition(l1, l2, "on")
        printFirstForCondition(l1, l2, "off")
        printFirstForCondition(l1, l2, "stopped")
    }

    private fun printFirstForCondition(l1: List<String>, l2: List<String>, criterion: String) {
        val key1 = l1.zip(l2).firstOrNull { it.second ==  criterion}?.first ?: "n/a"
        println("key1 = $key1")
        val key2 = l1.zip(l2).firstOrNull { it.second ==  criterion}?.first ?: throw NoSuchElementException("Condition not met")
        println("key2 = $key2")
    }

    private fun firstPositive(lst: MutableList<Int>) {
        val firstPositive = lst.firstOrNull { it > 0 }
        println("firstPositive = $firstPositive")
    }
}