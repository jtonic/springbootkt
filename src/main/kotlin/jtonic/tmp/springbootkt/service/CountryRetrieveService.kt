package jtonic.tmp.springbootkt.service

import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */

@Service
@CacheConfig(cacheNames = arrayOf("countries"))
class CountryRetrieveService {

    private val countryCodes = mapOf("ro"  to "Romania", "fr" to "France")

    @Cacheable(key = "#code")
    fun findByCode(code: String?): String {
        return countryCodes[code]?: "no country"
    }
}