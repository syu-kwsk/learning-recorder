package practice.collection

fun main() {
//    setは順番無し重複無し
//    immutableとmutable

//    immutable
    var strings: Set<String> = setOf("A", "B", "C")
    println(strings)
    println("")

//    mutable
    var mutableStrings: MutableSet<String> = mutableSetOf("x", "y", "z")
    mutableStrings.add("A")
    println(mutableStrings)
    mutableStrings.remove("x")
    println(mutableStrings)
    mutableStrings.add("y") //already exist element, return false, not error
    println(mutableStrings)
    println("")

}