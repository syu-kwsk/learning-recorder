package practice.function

fun main() {
//    how to define function
    fun times(a: Int, b: Int): Int {
        return a * b
    }
    println(times(2, 5))

//    void function
//    Unit type is optional
    fun printTimes(a: Int, b: Int) : Unit {
        println("$a multiplied by $b is ${a*b}")
    }
    printTimes(2, 3)

}