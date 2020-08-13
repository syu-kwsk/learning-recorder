package practice

fun main() {
    val multiline = """Oh
        Have a
              nice Kotlin!
    """
    println(multiline)

    val multiline2 = """
        |Oh
          |Have a
|nice Kotlin!""".trimMargin() // |より前削除
    println(multiline2)

    val multiline3 = """
        Oh
     Have a
              nice Kotlin!
    """.trimIndent() // インデントが小さいやつに合わせる
    println(multiline3)

    var str = "Kotlin"
    if (str == "Kotlin") println("Hello, Kotlin!")
    else if (str == "Java") println("Hello, Java!")

    val a = Integer(12)
    val b = Integer(12)
    println(a === b) // オブジェクト比較
    println(a == b) // 値比較

}