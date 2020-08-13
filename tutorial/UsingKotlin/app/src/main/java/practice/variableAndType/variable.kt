package practice.variableAndType

fun main() {
    //宣言は
    //name: type

    var a: Int = 1000 //varは変数
    println(a)
    a = 2000 //再代入OK
    println(a)

    val b: Int = 10000 //valは定数
    println(b)
    //b = 20000 // error 再代入不可
}