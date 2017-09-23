package jtonic.tmp.springbootkt.miscs

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON

/**
 * Created by Antonel Ernest Pazargic on 23/09/2017.
 * @author Antonel Ernest Pazargic
 */

@Serializable
data class City(val name: String, @Optional val population: Long? = 2_000_000)

fun main(args: Array<String>) {
    val json = JSON.stringify(City("Bucharest", 2_500_000))
    println("json = $json")

    val city: City = JSON.indented.parse(json)
    println("city = $city")

    val cityJson = """{"name":"Bucharest"}"""
    val city1: City = JSON.indented.parse(cityJson)
    println("city1 = $city1")
}