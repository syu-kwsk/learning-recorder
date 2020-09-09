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

}

class Dog(val name: String) {
    var age: Int = 0
    fun message(): String {
        return "Dog's name is $name, $age years old"
    }
}