package practice.otherFeatures

fun main() {
//    "is" check type
    var num: Int = 1;
    println(getLen(num))
    var str: String = "one"
    println(getLen(str))

//    use "as" operator
    open class Person(val name: String) {}
    class Student(name: String, var degree: String) : Person(name) {}

    var person: Person = Student("Sato", "Bachelor")
    var student: Student = person as Student // cast to Student
    println(student.name)
    println(student.degree)

//    null can't cast
//    var person2: Person? = null
//    var student2 = person2 as Student

//    irrelevant type can't cast
//    var person3: Person = Student("Sato", "Bachelor")
//    var student3 = person3 as Int

//    use "as?"
//    don't throw exception
    var person4: Person = Student("Sato", "Bachelor")
    var student4 = person4 as? Int
    print(student4 is Int)

}

fun getLen(obj: Any): Int? {
//    スマートキャスト
//    型チェックすればキャストが必要なくなる
    if (obj is String) {
        return obj.length
    }
    return null
}