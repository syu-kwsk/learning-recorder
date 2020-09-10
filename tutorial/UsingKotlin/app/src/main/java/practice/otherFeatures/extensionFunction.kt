package practice.otherFeatures

fun main() {
//    extension function use like object's member method
//    add extension function in "String" class
    fun String.surround() = "[$this]"
    println("Kotlin".surround())

}