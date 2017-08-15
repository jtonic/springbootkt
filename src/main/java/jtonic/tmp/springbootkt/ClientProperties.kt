package jtonic.tmp.springbootkt

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "client")
class ClientProperties(var name: String? = null)