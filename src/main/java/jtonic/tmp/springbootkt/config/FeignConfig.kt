package jtonic.tmp.springbootkt.config

import feign.Logger
import feign.Request
import jtonic.tmp.springbootkt.Application
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */
@Configuration
@EnableFeignClients(basePackageClasses = arrayOf(Application::class))
class FeignConfig {

    @Bean
    fun feignLogger(): Logger.Level = Logger.Level.FULL

    @Bean
    fun options(): Request.Options =
            Request.Options(FIVE_SECONDS, FIVE_SECONDS)

    companion object {
        val FIVE_SECONDS = 5000
    }
}