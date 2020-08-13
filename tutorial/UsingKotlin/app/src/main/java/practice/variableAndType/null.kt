package practice.variableAndType

fun main() {
    // null非許容型
    // 型が確定した変数にはnullを代入できない
    //var text: String = null // エラー

    // null許容型
    // 型の末尾に?をつける
    var text: String? = null //耐え

    var s: String? = "kotlin"
    //s.toUpperCase() //エラー nullの可能性があるので実行できない

}