package jtonic.tmp.springbootkt.kia.ch7

data class Person(val name: String) {
    val emails by lazy { getEmails(this) }
}

fun getEmails(person: Person): Set<String> {
    println("Getting all emails for person $person")
    return setOf("Email from antonel.pazargic@gmail.com", "Email from matei.cornea@ing.ro", "Email from andrei.flucus@ing.ro")
}
