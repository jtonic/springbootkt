package jtonic.tmp.springbootkt

import io.kotlintest.Spec
import io.kotlintest.specs.ShouldSpec
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.TestContextManager

//@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class SpringBootKtApplicationTests : ShouldSpec() {

    @Autowired lateinit var restTemplate: TestRestTemplate

    @LocalServerPort private var port: Int? = null

    override fun interceptSpec(context: Spec, spec: () -> Unit) {
        TestContextManager(context.javaClass).prepareTestInstance(context)
        spec()
    }

    init {
        should("call the hello endpoint") {
            val response = restTemplate.getForEntity("http://localhost:$port/kotlin/hello", String::class.java)
            println("response.body = ${response.body}")
            Assert.assertThat(response.body, CoreMatchers.startsWith("Hello"))
        }
    }

}
