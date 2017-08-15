package jtonic.tmp.springbootkt.controller

import jtonic.tmp.springbootkt.model.Animal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Antonel Ernest Pazargic on 18/07/2017.
 * @author Antonel Ernest Pazargic
 */
@RestController
@RequestMapping("zoo")
class Zoo {

    @GetMapping
    fun getAnimal(): Animal {
        return Animal.builder().age(47).name("Antonel").build()
    }
}