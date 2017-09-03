package jtonic.tmp.springbootkt.kia.ch7

import io.kotlintest.matchers.haveSize
import io.kotlintest.matchers.should
import io.kotlintest.matchers.shouldBe
import org.junit.Test
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FooDelegate : ReadWriteProperty<Foo, String> {

    private var value: String? = null

    override fun getValue(thisRef: Foo, property: KProperty<*>): String {
        println("getting the value = $value")
        return this.value ?: "n/a"
    }

    override fun setValue(thisRef: Foo, property: KProperty<*>, value: String) {
        println("setting the value = $value")
        this.value = value
    }

}

class Foo {
    var id: String by FooDelegate()
}

class DelegatesTest {

    @Test
    fun `test delegate 1`() {
        val foo = Foo()
        foo.id shouldBe "n/a"
        foo.id = "12345"
        foo.id shouldBe "12345"
    }

    @Test
    fun `test by lazy`() {
        val person = Person(name = "Antonel Pazargic")
        println("Accessing lazy property person's emails")
        println("person.emails = ${person.emails}")
        person.emails should haveSize(3)
    }
}