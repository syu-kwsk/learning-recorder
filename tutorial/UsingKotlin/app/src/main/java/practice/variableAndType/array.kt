package practice.variableAndType

fun main() {
    val arrayOfInt: Array<Int> = arrayOf(1, 2, 3, 5, 8) //配列の型は省略可能
    for (i in arrayOfInt) print("$i, ")

    println(arrayOfInt[0]) //-> 1

}