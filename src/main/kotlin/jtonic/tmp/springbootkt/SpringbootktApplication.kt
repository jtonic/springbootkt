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
            @Autowired printerService: PrinterService,
            @Autowired printService: PrintService) = CommandLineRunner {
        printerService.print("===============")
        printerService.print("===============")
        printerService.print("Antonel")
        printerService.print("===============")
        printerService.print("===============")
        println("printService.name = ${printService.name}")
        printService.print("This is me")
        println("Server name: " + serverProperties.name)
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(SpringbootktApplication::class.java, *args)
        }
    }

}
