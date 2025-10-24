package ch06

// 6.2.2 실습
data class Person622(val firstName: String, val lastName: String, val age: Int)

class CustomPerson(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

fun main() {
    val person = Person622("Jane", "Doe", 30)
    val firstName = person.firstName
    val lastName = person.lastName
    val age = person.age
    println("First Name: $firstName, Last Name: $lastName, Age: $age")

    var (firstName2, lastName2, age2) = person
    firstName2 = "John"
    println("First Name: $firstName2, Last Name: $lastName2, Age: $age2")

    val pairs = arrayOf(1 to "one", 2 to "two", 3 to "three")
    for ((number, word) in pairs) {
        println("$number -> $word")
    }

    val people = listOf(
        Person622("Alice", "Smith", 28),
        Person622("Bob", "Johnson", 35),
        Person622("Charlie", "Brown", 22)
    )

    people.forEach { (firstName3, _, age3) ->
        println("First Name: $firstName3, Age: $age3")
    }

    val customPerson = CustomPerson("Emily", "Davis", 27)
    val (cFirstName, cLastName, cAge) = customPerson
    println("Custom Person - First Name: $cFirstName, Last Name: $cLastName, Age: $cAge")
}