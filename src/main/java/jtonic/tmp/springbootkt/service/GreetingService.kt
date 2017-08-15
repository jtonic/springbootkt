package jtonic.tmp.springbootkt.service

import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotNull

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
@Service
@Validated
class GreetingService {

    @Validated
    fun greet(@NotNull name: String?) = "Hello ${name ?: "noname"}"

}