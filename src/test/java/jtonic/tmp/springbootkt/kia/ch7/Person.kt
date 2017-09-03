package jtonic.tmp.springbootkt.kia.ch7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(propertyChangeListener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(propertyChangeListener)
    }

    fun removePropertyChangeListener(propertyChangeListener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(propertyChangeListener)
    }
}

class Person(val name: String, age: Int = 30, salary: Int = 1500) : PropertyChangeAware() {
    val emails by lazy { getEmails(this) }

    private val observer = { prop: KProperty<*>, oldValue: Int, newValue: Int -> changeSupport.firePropertyChange(prop.name, oldValue, newValue) }
    var age: Int by Delegates.observable(initialValue = age, onChange = observer)
    var salary: Int by Delegates.observable(initialValue = salary, onChange = observer)
}

fun getEmails(person: Person): Set<String> {
    println("Getting all emails for person $person")
    return setOf("Email from antonel.pazargic@gmail.com", "Email from matei.cornea@ing.ro", "Email from andrei.flucus@ing.ro")
}

class Customer {
    private var _attributes = hashMapOf<String, Any>()

    fun setAttribute(name: String, value: Any) {
        _attributes[name] = value
    }

    val name: String by _attributes
    val age: Int by _attributes
}