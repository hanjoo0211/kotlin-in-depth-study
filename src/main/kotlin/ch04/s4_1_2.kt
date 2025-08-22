package ch04

// 4.1.2 실습
class Person2(firstName: String, lastName: String) {
    val fullName = "$firstName $lastName"

    init {
        println("Person2 created: $fullName")
    }
}

class Person22 {
    val fullName: String
    constructor(firstName: String, lastName: String):
            this("$firstName $lastName")
    constructor(fullName: String) {
        this.fullName = fullName
    }
}

fun main() {

}
