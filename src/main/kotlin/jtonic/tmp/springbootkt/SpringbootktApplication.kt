package jtonic.tmp.springbootkt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringbootktApplication {
    @Bean
    fun init(
            @Autowired serverProperties: ServerPropertiesJava,
            @Autowired printService: PrinterService) = CommandLineRunner {
        printService.print("===============")
        printService.print("===============")
        printService.print("Antonel")
        printService.print("===============")
        printService.print("===============")
        println("Server name: " + serverProperties.name)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootktApplication::class.java, *args)
}
