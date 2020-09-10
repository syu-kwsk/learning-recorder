package practice.otherFeatures

fun main() {
//    スコープ関数
//    変数のスコープを変更する

//    "with" function
//    without "with"
    val dog = Dog("Pochi")
    dog.age = 10
    dog.message()
//    with "with"
    with(Dog("Pochi")) {
        age = 10
        println(message())
    }

//    "apply" function
//    return target object
    var msg = Dog("Pochi").apply {
        age = 10
    }.message() // return string
    println(msg)

//    "let" function
//    without "let"
//    need "?." in every time
    var name: String? = "Peter"
    var upperCase = name?.toUpperCase()
    var len = name?.length
    println("$upperCase $len")
//    with "let"
    var output = name?.let {
        var upperCase = it.toUpperCase()
        var len = it.length
        "$upperCase $len" // return value
    }
    println(output)

//    "run" function
//    "run" like "with" and "let"
    var output2 = name?.run {
        "${toUpperCase()} $length"
    }
    println(output2)

}

class Dog(val name: String) {
    var age: Int = 0
    fun message(): String {
        return "Dog's name is $name, $age years old"
    }
}