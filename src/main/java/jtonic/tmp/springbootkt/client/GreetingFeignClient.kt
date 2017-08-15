package jtonic.tmp.springbootkt.client

import jtonic.tmp.springbootkt.config.FeignConfig
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */
@FeignClient(value = "greeting-service", configuration = arrayOf(FeignConfig::class))
interface GreetingFeignClient {

    @GetMapping("/greeting/hello")
    fun greeting(@RequestParam("name") name: String): String
}