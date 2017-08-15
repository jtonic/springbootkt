package jtonic.tmp.springbootkt.controller

import jtonic.tmp.springbootkt.service.GreetingService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
@RestController
@RequestMapping("/greeting")
class GreetingController(val greetingService: GreetingService) {

    @GetMapping("/hello", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE))
    fun hello(@RequestParam("name") name: String?) = greetingService.greet(name)
}