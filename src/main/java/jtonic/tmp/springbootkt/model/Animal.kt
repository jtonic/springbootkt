package jtonic.tmp.springbootkt.model

/**
 * Created by Antonel Ernest Pazargic on 18/07/2017.

 * @author Antonel Ernest Pazargic
 */
open class Animal (var name: String?, var age: Int) {

    override fun equals(o: Any?): Boolean {
        if (o === this) {
            return true
        }
        if (o !is Animal) {
            return false
        }
        val other = o as Animal?
        if (!other!!.canEqual(this as Any)) {
            return false
        }
        val `this$name` = this.name
        val `other$name` = other.name
        if (if (`this$name` == null) `other$name` != null else `this$name` != `other$name`) {
            return false
        }
        if (this.age != other.age) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = 1
        val `$name` = this.name
        result = result * PRIME + (`$name`?.hashCode() ?: 43)
        result = result * PRIME + this.age
        return result
    }

    protected fun canEqual(other: Any): Boolean {
        return other is Animal
    }

    override fun toString(): String {
        return "Animal (name=$name, age=$age)"
    }

    class AnimalBuilder {

        private var name: String? = null
        private var age: Int = 0

        fun name(name: String): Animal.AnimalBuilder {
            this.name = name
            return this
        }

        fun age(age: Int): Animal.AnimalBuilder {
            this.age = age
            return this
        }

        fun build(): Animal {
            return Animal(name, age)
        }

    }

    companion object {

        fun builder(): AnimalBuilder {
            return AnimalBuilder()
        }
    }
}
