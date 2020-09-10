package practice.classAndInterface

interface Pet {
    fun eat()
    fun showName(name: String) = println("I'm $name")
}

class Cat(val name: String) : Pet {
    override fun eat() = println("I'm eating")
}

fun main() {
    val cat = Cat("Mike")
    cat.eat()
    cat.showName(cat.name)
}