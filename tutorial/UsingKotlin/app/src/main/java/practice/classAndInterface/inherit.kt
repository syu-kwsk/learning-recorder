package practice.classAndInterface

open class Person(val name: String) {}
class Student(name: String, var degree: String) : Person(name) {}

fun main() {
    val student = Student("Sato", "Bachelor")
    println(student)
    println(student.name)
    println(student.degree)

}