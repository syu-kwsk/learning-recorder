package practice.controlSyntax

fun main() {
    // when式はswitch文みたいなやつ
    val a: Int = 4
    when(a) {
        1    -> println("a == 1")
        2, 3 -> println("a == 2 or a == 3")
        else -> println("otherwise") // a = 4なのでここ
    }

    // 評価を範囲で行うin ..
    when(a) {
        in 1..3  -> println("a in in the range")
        in 4..9 -> println("a is outside the range")
        else     -> {
            println("otherwise")
            println("a is not in 1 to 10") //複数行のときは{}
        }
    }

    //when式から値を受け取るelse必須
    val b = when(a) {
        1       -> "a == 1"
        in 2..5 -> "a in 2 to 5"
        else    -> "otherwise"
    }
    println(b)

    val c: Any = "Kotlin" //すべてのクラスの親
    when(c) {
        is Int    -> print(a * a) //castしなくていい
        is String -> println(c.toUpperCase()) //castしなくていい
    }

}