package jtonic.tmp.springbootkt.kia.ch2

import io.kotlintest.matchers.shouldBe
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 08/08/2017.
 * @author Antonel Ernest Pazargic
 */

class VariablesTest {


    @Test
    fun `test variables`() {
        val assert: Boolean = false
        val message: String
        if (assert) {
            message = "asserted"
        } else { // remove the else block and you will end up with a compilation error
            message = "not asserted"
        }

        message shouldBe "not asserted"
    }
}