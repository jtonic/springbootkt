package jtonic.tmp.springbootkt

import jtonic.tmp.springbootkt.service.GreetingCallService
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableConfigurationProperties(ServerPropertiesJava::class, ClientProperties::class)
class Application : SpringBootServletInitializer() {

    override fun configure(builder: SpringApplicationBuilder?): SpringApplicationBuilder {
        return builder!!.sources(Application::class.java)
    }

    @Bean
    fun init(
            @Value("\${client.name}") clientName: String,
            clientProperties: ClientProperties,
            serverProperties: ServerPropertiesJava,
            printerService: PrinterService,
            printService: PrintService,
            greetingCallService: GreetingCallService) = CommandLineRunner {args ->

        printerService.print("===============")
        println("printService.name = ${printService.name}")
        println("Server name: " + serverProperties.name)
        println("Client name = ${clientProperties.name}")
        println("Client name = $clientName")


        if (args.isNotEmpty()) {
            val appType = args[0]
            println("Application type = $appType")

            if(appType == "client") {
                val greeting = greetingCallService.greeting("Antonel")
                println("[FEIGN] greeting = $greeting")
            }
        }
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
