package jtonic.tmp.springbootkt

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class SpringBootKtApplicationTests {

    @Autowired lateinit var trestTemplate: TestRestTemplate

    @LocalServerPort var port: Int? = null

    @Test
    fun testHelloRestController() {
        val response = trestTemplate.getForEntity("http://localhost:$port/kotlin/hello", String::class.java)
        println("response.body = ${response.body}")
        Assert.assertThat(response.body, CoreMatchers.startsWith("Hello"))
    }

}
