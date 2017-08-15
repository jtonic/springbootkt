package jtonic.tmp.springbootkt

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldNotBe
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTestsJUnit {

    @Autowired lateinit var restTemplate: TestRestTemplate

    @LocalServerPort private var  port: Int? = null

    @Value("\${client.name}") lateinit var clientName: String

    @Autowired lateinit var client: ClientProperties

    @Test fun `local server port and RestTemplate should not be null`() {
        port shouldNotBe null
        restTemplate shouldNotBe null
        clientName shouldNotBe null
        clientName shouldBe "My client"
        client.name shouldNotBe null
    }
}