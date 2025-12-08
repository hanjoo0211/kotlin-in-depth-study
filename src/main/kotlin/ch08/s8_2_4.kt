package ch08

// 8.2.4 실습
interface PersonData {
    val name: String
    val age: Int
}

open class Person824(
    override val name: String,
    override val age: Int
): PersonData

data class Book(val title: String, val author: PersonData) {
    override fun toString() = "'$title' by ${author.name}"
}

//class Alias(
//    private val realIdentity: PersonData,
//    private val newIdentity: PersonData
//): PersonData {
//    override val name: String
//        get() = newIdentity.name
//
//    override val age: Int
//        get() = realIdentity.age
//}

//class Alias(
//    private val realIdentity: PersonData,
//    private val newIdentity: PersonData
//): PersonData by newIdentity {
//    override val age: Int
//        get() = realIdentity.age
//}

class Alias(
    private val realIdentity: PersonData,
    newIdentity: PersonData
): PersonData by newIdentity

fun main() {
    val valWatts = Person824("Val Watts", 30)
//    val introKotlin = Book("Introduction to Kotlin", valWatts)
    val johnDoe = Alias(valWatts, Person824("John Doe", 25))
    val introKotlin = Book("Introduction to Kotlin", johnDoe)

    println(introKotlin)
}
