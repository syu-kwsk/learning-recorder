package practice.controlSyntax

fun main() {
    val a = 10
    val b = 20
    println("a = $a, b = $b")

    // if式なので値を返すことができる
    val max = if (a < b) {
        println("a is greater than b")
        a
    } else {
        println("a is less than b")
        b
    }

    print("max is $max")
}