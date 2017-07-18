package jtonic.tmp.springbootkt

/**
 * Created by Antonel Ernest Pazargic on 25/06/2017.
 * @author Antonel Ernest Pazargic
 */
class CarService {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val myCar = Car(name = "Octavia", make = "Skoda")
            println("My car = $myCar")
            println("My car name = ${myCar.name}")
            println("My car make = ${myCar.make}")
        }
    }
}