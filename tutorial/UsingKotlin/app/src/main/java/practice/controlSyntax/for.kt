package practice.controlSyntax

fun main() {
//  forはイテレータを回す
    val array = arrayOf(1, 2, 3, 10, 100, 1000)
    for (a in array) print("$a,")
    println("")

//  添字を使うならindices
    for (i in array.indices) {
        print("array[$i] = ${array[i]}\n")
    }

//  範囲式
//  通常
    for (i in 1..4) print(i)
    println("")
//  カウントダウン
    for (i in 4 downTo 1) print(i)
    println()
//  step
    for (i in 0..9 step 2) print(i)
    println("")
//  downTo and step
    for (i in 9 downTo 0 step 2) print(i)
    println("")

}