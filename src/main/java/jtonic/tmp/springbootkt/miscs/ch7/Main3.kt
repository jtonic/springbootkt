package jtonic.tmp.springbootkt.miscs.ch7

/**
 * Created by Antonel Ernest Pazargic on 09/07/2017.
 * @author Antonel Ernest Pazargic
 */
class Main3 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(stringLength("aaa"))
            println(stringLength(null))
        }
        fun stringLength(any: Any?): Int = (any as? String)?.length ?: -1
    }
}