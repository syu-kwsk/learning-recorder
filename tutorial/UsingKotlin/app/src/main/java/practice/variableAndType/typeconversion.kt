package practice.variableAndType

fun main() {
    // to型名メソッドで型変換
    val str = "64"
    val intVal: Int = str.toInt() //intに変換
    println(intVal)

    val str2 = "Kotlin"
    //val intVal2: Int = str2.toInt() //変換エラー
    val intValOrNull: Int? = str2.toIntOrNull() //例外dでnull
    println(intValOrNull)

    val num = 128
    val intStr: String = num.toString() //すべてのオブジェクトに対しtoStringが可能
    println(intStr)

    //数値同士の型変換でも明示的にtoTypeが必要
    val i: Int = 100
    //val l: Long = i // エラー
    val l: Long = i.toLong() //Longに変換
    println(l)
}