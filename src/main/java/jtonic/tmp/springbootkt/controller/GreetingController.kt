package jtonic.tmp.springbootkt.controller

import jtonic.tmp.springbootkt.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
@RestController
@RequestMapping(path = arrayOf("/kotlin"))
class GreetingController(val greetingService: GreetingService) {

    @GetMapping(path = arrayOf("/hello"))
    fun hello() = greetingService.greet()
}