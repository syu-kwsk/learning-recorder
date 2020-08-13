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
}