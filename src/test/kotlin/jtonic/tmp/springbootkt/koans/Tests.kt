package jtonic.tmp.springbootkt.koans

import io.kotlintest.matchers.shouldBe
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 03/08/2017.
 * @author Antonel Ernest Pazargic
 */


class Tests {

    @Test fun `test toJON`() {
        JavaCode().toJSON(listOf(1, 2, 3)) shouldBe "[1, 2, 3]"
    }
}