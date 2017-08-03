package jtonic.tmp.springbootkt.koans;

class JavaCode {
    fun toJSON(collection: Collection<Int>) = collection.joinToString(separator = ", ", prefix = "[", postfix = "]")

}