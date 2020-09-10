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

//    mutable
    val numbers: MutableList<Int> = mutableListOf(2, 4, 6)
    println(numbers)
    numbers.add(4)
    println(numbers) // [2, 4, 6, 4]
    numbers.remove(4) // remove single specified element
    println(numbers) // [2, 6, 4]

}