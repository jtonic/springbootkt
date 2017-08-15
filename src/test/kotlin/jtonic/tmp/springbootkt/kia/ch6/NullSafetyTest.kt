package jtonic.tmp.springbootkt.kia.ch6

import io.kotlintest.matchers.shouldBe
import org.junit.Test

class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()

    override fun toString() =
        "$firstName $lastName"

}

class NullSafetyTest {

    @Test
    fun `test safe cast`() {
        val p1 = Person("Antonel", "Pazargic")
        val p2 = Person("Irina", "Pazargic")
        val p3 = Person("Antonel", "Pazargic")
        val name: Any = "Antonel Pazargic"

        (p1 == p2) shouldBe false
        (p1 == p3) shouldBe true
        (p1 == name) shouldBe false
    }

    @Test
    fun `string as Pazargic`() {
        "Antonel".toPazargic() shouldBe Person("Antonel", "Pazargic")
        val noName: String? = null
        noName.toPazargic() shouldBe Person("Unborn", "Pazargic")
    }
}

fun String?.toPazargic() = Person(this?: "Unborn", "Pazargic")
