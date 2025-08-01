package ch02

// 2.1.5 실습

fun main() {
    println(false && true || false) // (false && true) || false -> false
    println(false || true && false) // false || (true && false) -> false
    println(false and true or false) // Kotlin에서 and, or는 거의 안 씀
    println(false or true and false)
}
