package practice.classAndInterface

fun main() {
    val dog = Dog()
    dog.name = "Pochi"
    println(dog.name)

}

class Dog {
    var name: String = "" // if use val, it is read only property
}