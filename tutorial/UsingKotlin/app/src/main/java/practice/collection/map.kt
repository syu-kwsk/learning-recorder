package practice.collection

fun main() {
//    mapはkey&value, keyは重複なし
//    mutableとimmutable
    val immutableFruits: Map<String, Int> = mapOf("apple" to 1, "orange" to 2, "banana" to 3)
    print(immutableFruits)
    println("")

//    mutable
    val mutableFruits: MutableMap<String, Int> = mutableMapOf(
        "apple" to 1,
        "orange" to 2,
        "banana" to 3
    )
    print(mutableFruits.get("apple")) //  Should be replaced with indexing
    print(", ")
    print(mutableFruits["orange"])
    println("")
//    add & remove element
    mutableFruits.put(
        "melon", 4
    ) // Should be mutableFruits["melon"] = 4
    println(mutableFruits)

    mutableFruits.remove("banana")
    println(mutableFruits)

}