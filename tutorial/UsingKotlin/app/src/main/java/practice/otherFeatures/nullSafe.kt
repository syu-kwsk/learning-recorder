package practice.otherFeatures

fun main() {
//    安全呼び出し演算子 "?."
//    objectがnullならnullが返される

//    s is null
    var s: String? = null
    println("The length of $s is ${s?.length}.")
//    s is "abc"
    s = "abc"
    println("The length of $s is ${s?.length}.")

//    エルビス演算子 "?:"
//    nullの場合にデフォルト値を返す
    s = null
    val t: String = s ?: "default"
    println(t)
//    nullable argument
    fun lengthNullable(s: String?) = s?.length ?: 0
    println(lengthNullable("abcd"))
    println(lengthNullable(null))

//    null check
    val a:String?? ="kotlin"
    if (a != null) { // check a is not null
        println(a.toUpperCase()) //called without null safe operand
    }

}