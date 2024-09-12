package dsl.crossconf.shared

object RandomUtils {

    fun getRandom() : String {
        return (1..6).random().toString()
    }
}