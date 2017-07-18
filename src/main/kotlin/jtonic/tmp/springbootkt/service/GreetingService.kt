package jtonic.tmp.springbootkt.service

import jtonic.tmp.springbootkt.constants.E
import jtonic.tmp.springbootkt.constants.PI
import org.springframework.stereotype.Service

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
@Service
class GreetingService {

    fun greet() = "Hello. PI= $PI, E= $E"

}