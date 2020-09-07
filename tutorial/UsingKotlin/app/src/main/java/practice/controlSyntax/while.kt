package practice.controlSyntax

fun main() {
//  while
    var x = 0
    while (x < 10) print(x++)
    println("")

//  do-while
    var i = 7
    do {
        print("i = ${i--}, ")
    } while (i > 4)
    println("")

}