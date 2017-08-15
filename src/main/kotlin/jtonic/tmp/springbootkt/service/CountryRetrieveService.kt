package jtonic.tmp.springbootkt.service

import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotNull

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */

@Service
@CacheConfig(cacheNames = arrayOf("countries"))
@Validated
class CountryRetrieveService {

    private val countryCodes = mapOf("ro"  to "Romania", "fr" to "France")

    @Cacheable(key = "#code")
    @Validated
    fun findByCode(@NotNull code: String?) = countryCodes[code]?: "no country"
}