package ch05

// 5.1.4 실습
fun check4(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()

class Person4(val firstName: String, val lastName: String)

fun main() {
    println(check4("Hello") { c -> c.isUpperCase()})
    println(check4("Hello") { isCapitalLetter(it) })
    println(check4("Hello", ::isCapitalLetter))

    val createPerson = ::Person4
    createPerson("John", "Doe")
}
