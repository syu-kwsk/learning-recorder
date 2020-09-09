package practice.otherFeatures

fun main() {
//    object keyword define class and generate instance
    println(MyProfile.getSignature())

//    companion object serves static methods
    Person.printMe()

}

object MyProfile {
    var name: String = "syu kwsk"
    var postalCode: String = "000-0000"
    fun getSignature() {
        println("$postalCode $name")
    }
}

class Person(val name: String) {
    companion object {
        fun printMe() = println("Hello, kotlin!")
    }
}
