package practice.otherFeatures

fun main() {
//    object keyword define class and generate instance
    println(MyProfile.getSignature())
}

object MyProfile {
    var name: String = "syu kwsk"
    var postalCode: String = "000-0000"
    fun getSignature() {
        println("$postalCode $name")
    }
}
