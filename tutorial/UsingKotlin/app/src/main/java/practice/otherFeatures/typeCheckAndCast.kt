package practice.otherFeatures

fun main() {
//    "is" check type
    var num: Int = 1;
    println(getLen(num))
    var str: String = "one"
    println(getLen(str))

}

fun getLen(obj: Any): Int? {
//    スマートキャスト
//    型チェックすればキャストが必要なくなる
    if (obj is String) {
        return obj.length
    }
    return null
}