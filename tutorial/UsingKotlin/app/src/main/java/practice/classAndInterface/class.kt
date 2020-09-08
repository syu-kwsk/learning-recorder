package practice.classAndInterface

import java.nio.file.attribute.FileOwnerAttributeView

fun main() {
    val dog = Dog()
    dog.name = "Pochi"
    println(dog.name)
//    use custom setter
    dog.age = 10
    println(dog.age)
//    late initialize modifier
    dog.owner = "Taro"
    println(dog.owner)

}

class Dog {
    var name: String = "" // if use val, it is read only property

//    set double age
//    parameter is called "field"
    var age: Int = 0
        set(value) {
            field = value*2 // field = this.age
        }

//    late initialize property
    lateinit var owner: String

}