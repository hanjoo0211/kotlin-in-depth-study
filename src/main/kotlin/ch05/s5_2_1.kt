package ch05

// 5.2.1 실습
fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength)
}

fun main() {
    println("Hello".truncate(10))
    println("Hello".truncate(3))

    val trct = String::truncate
    println(trct("Hello", 10))
    println(trct("Hello", 3))
}
