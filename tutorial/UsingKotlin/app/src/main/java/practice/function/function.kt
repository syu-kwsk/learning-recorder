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

//    argument, default argument
    fun argTimes(a: Int, b: Int = 2) = a * b
    println(argTimes(2)) // second arg is 2 by default
//    named argument
    fun calc(a: Int, b:Int=1, c:Int=1, d:Int=1) = a*b - c/d
    println(calc(5, c = 4)) // 5*1 - 4/1 = 1

}