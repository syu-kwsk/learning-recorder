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

//    use implicit "it"
//    a arg can be used in lambda as "it"
    var double: (Int)->Int = {it * 2}
    println(double(5))
//    same as
    var double2: (Int)->Int = {x -> x*2}

//    functional type as argument
    fun doLambda(x: Int, l: (Int)->Int) = l(x)
    println(doLambda(5) { it * 2 })
//    change process
    println(doLambda(4){ it * 10 })

}