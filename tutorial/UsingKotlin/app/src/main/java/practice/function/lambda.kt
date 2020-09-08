package practice.function

fun main() {
//    lambda式は関数に処理を与えて動的に変化させられる
//    {}必須、最終評価値がreturnされる
//    { argument -> process }

//    use lambda expression
    var minus = {x: Int, y: Int -> x - y} //called functional type
    println(minus(3, 1))
//    define functional type
    var minus2: (Int, Int) -> Int = {x: Int, y:Int -> x - y }
    println(minus(3, 1))
//    optional
    var minus3: (Int, Int) -> Int = {x, y -> x - y}
    println(minus(3, 1))

}