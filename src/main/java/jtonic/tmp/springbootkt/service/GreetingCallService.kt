package jtonic.tmp.springbootkt.service

import jtonic.tmp.springbootkt.client.GreetingFeignClient
import org.springframework.stereotype.Service

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */
@Service
class GreetingCallService(val greetingFeignClient: GreetingFeignClient) {

    fun greeting(name: String) = greetingFeignClient.greeting(name)
}