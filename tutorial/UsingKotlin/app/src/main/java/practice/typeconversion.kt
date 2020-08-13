package practice

fun main() {
    // to型名メソッドで型変換
    val str = "64"
    val intVal: Int = str.toInt() //intに変換
    println(intVal)

    val str2 = "Kotlin"
    //val intVal2: Int = str2.toInt() //変換エラー
    val intValOrNull: Int? = str2.toIntOrNull() //例外dでnull
    println(intValOrNull)

}