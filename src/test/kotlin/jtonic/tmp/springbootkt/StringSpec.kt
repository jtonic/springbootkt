package jtonic.tmp.springbootkt

import io.kotlintest.matchers.*
import io.kotlintest.specs.StringSpec

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
class StringSpec: StringSpec() {
    init {
        "The length of empty string should be 0" {
            "" should haveLength(0)
        }.config(invocations = 3)

    }
}