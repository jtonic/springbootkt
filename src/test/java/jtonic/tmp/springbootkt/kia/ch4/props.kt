package jtonic.tmp.springbootkt.kia.ch4

import io.kotlintest.matchers.shouldBe
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 27/08/2017.
 * @author Antonel Ernest Pazargic
 */

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribedUser(val email: String): User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val id: String) : User {
    override val nickname: String
        get() = getUsernameById(id)

    private fun getUsernameById(id: String) = id
}

class TestInterfaceProp {

    @Test
    fun `test interface properties`() {
        val user1: User = PrivateUser("antonel.pazargic")
        user1.nickname shouldBe "antonel.pazargic"

        val user2: User = SubscribedUser("antonel.pazargic@gmail.com")
        user2.nickname shouldBe "antonel.pazargic"

        val user3: User = FacebookUser("antonelpazargic")
        user3.nickname shouldBe "antonelpazargic"
    }
}