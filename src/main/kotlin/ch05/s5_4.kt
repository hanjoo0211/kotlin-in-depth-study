package ch05

// 5.4 실습
fun IntRange.Companion.singletonRange(n: Int) = n..n

val String.Companion.HELLO: String
    get() = "Hello"

class Person(val firstName: String, val lastName: String) {
    companion object
}

val Person.Companion.UNKNOWN by lazy { Person("Unknown", "Unknown") }

fun main() {
    println(IntRange.singletonRange(5))
    println(IntRange.Companion.singletonRange(5))

    println(String.HELLO)
    println(String.Companion.HELLO)
}
