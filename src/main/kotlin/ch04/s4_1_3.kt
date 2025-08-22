package ch04

// 4.1.3 실습
class Person3(protected val firstName: String, private val lastName: String) {
    fun fullName() = "$firstName $lastName"
}

fun main() {
    val person = Person3("John", "Doe")
    println("Full name: ${person.fullName()}")
//    println(person.firstName)
}
