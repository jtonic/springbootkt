package jtonic.tmp.springbootkt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

//@Component
//@ConfigurationProperties(prefix = "server")
data class ServerProperties(var name: String?)