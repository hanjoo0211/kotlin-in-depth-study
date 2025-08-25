package ch04

// 4.3.3 실습
class Person433(val firstName: String, val lastName: String) {
    val fullName: String
        get(): String {
            return "$firstName $lastName"
        }
//        get() = "$firstName $lastName"
}

class Person4331(val firstName: String, val lastName: String, age: Int) {
    val age: Int = age
        get() {
            println("Accessing age")
            return field
        }
}

class Person4332(val firstName: String, val lastName: String) {
    var age: Int? = null
        set(value) {
            if (value != null && value <= 0) {
                throw IllegalArgumentException("Age must be positive")
            }
            field = value
        }
}

fun main() {
    val person = Person433("John", "Doe")
    println(person.fullName)

    val person1  = Person4332("John", "Doe")
    person1.age = 30
    println("Age: ${person1.age}")
}