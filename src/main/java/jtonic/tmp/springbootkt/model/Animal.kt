package jtonic.tmp.springbootkt.model

/**
 * Created by Antonel Ernest Pazargic on 18/07/2017.

 * @author Antonel Ernest Pazargic
 */
open class Animal (var name: String?, var age: Int) {

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
