package practice.collection

fun main() {
//    listにはmutableとimmutableで関数が異なる
//    read only = immutable
    val items: List<Int> = listOf(1,2,3)
    println(items)
//    get element
    println(items.get(0)) // Should be replaced with indexing
    println(items[1])
    println(items.size)

}