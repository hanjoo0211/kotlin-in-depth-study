package ch04

// 4.1.1 실습
class Person {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0

    fun fullName() = "$firstName $lastName"

    fun showMe() {
        println("${fullName()}: $age")
    }
}

fun showAge(p: Person) {
    println("Age: ${p.age}")
}

fun main() {
    val person = Person()
    person.firstName = "John"
    person.lastName = "Doe"
    person.age = 30

    person.showMe()

    showAge(person)
}
