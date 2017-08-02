package jtonic.tmp.springbootkt

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableConfigurationProperties(ServerPropertiesJava::class, ClientProperties::class)
class SpringBootKtApplication {

    @Bean
    fun init(
            @Value("\${client.name}") clientName: String,
            clientProperties: ClientProperties,
            serverProperties: ServerPropertiesJava,
            printerService: PrinterService,
            printService: PrintService) = CommandLineRunner {

        printerService.print("===============")
        println("printService.name = ${printService.name}")
        println("Server name: " + serverProperties.name)
        println("Client name = ${clientProperties.name}")
        println("Client name = $clientName")
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(SpringBootKtApplication::class.java, *args)
        }
    }

}
