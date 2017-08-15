package jtonic.tmp.springbootkt.config

import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Configuration

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */
@EnableCaching(proxyTargetClass = true)
@Configuration
class CacheConfig