package jtonic.tmp.springbootkt.kia.ch6

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 07/08/2017.
 * @author Antonel Ernest Pazargic
 */


class NullSafeTest {

    @Test
    fun `test safe cast`() {
        val st: Any = "Antonel"

        val asString = st as? String
        asString shouldBe "Antonel"

        val asInt1 = st as? Int
        asInt1 shouldBe null

        shouldThrow<AssertionError> {
            val asInt2 = st as? Int ?: throw AssertionError("$st cannot be converted to int")
            println("asInt2 = $asInt2")
        }
    }
}
