package jtonic.tmp.springbootkt.miscs

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import org.junit.Test
import java.net.MalformedURLException
import java.net.URL


/**
 * Created by Antonel Ernest Pazargic on 27/08/2017.
 * @author Antonel Ernest Pazargic
 */


class TestCustomUrlProtocol {

    @Test
    fun `test custom url protocol`() {
        val exc = shouldThrow<MalformedURLException> {
            URL("payconiq://gmail.com")
        }
        exc.message shouldBe "unknown protocol: payconiq"

        URL.setURLStreamHandlerFactory(MobileUrlStreamHandlerFactory())
        URL("payconiq://gmail.com")
    }

}

