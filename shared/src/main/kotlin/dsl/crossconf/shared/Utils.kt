package dsl.crossconf.shared

object Utils {

    var version: String = ""

    fun getRandom() : String {
        return (1..6).random().toString()
    }
}