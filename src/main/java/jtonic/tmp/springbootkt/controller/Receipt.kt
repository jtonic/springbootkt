package jtonic.tmp.springbootkt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Antonel Ernest Pazargic on 17/07/2017.
 * @author Antonel Ernest Pazargic
 */
@RestController
@RequestMapping("/kotlin")
class Receipt {

    @GetMapping("/receipt")
    fun getReceipt(@RequestParam("ingredients", required = false) ingredients: Array<String>) {
        ingredients.forEach { println(it) }
    }
}