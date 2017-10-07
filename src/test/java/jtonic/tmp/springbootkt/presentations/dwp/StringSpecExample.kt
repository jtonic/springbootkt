package jtonic.tmp.springbootkt.presentations.dwp;

import io.kotlintest.matchers.should
import io.kotlintest.matchers.startWith
import io.kotlintest.specs.StringSpec

class StringSpecExample : StringSpec() {
    init {
        "should start with Antonel" {
            "Antonel Pazargic" should startWith("Antonel")
        }

    }
}
