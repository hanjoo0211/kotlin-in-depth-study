package ch02

// 2.2.6 실습

fun main() {
    val n = 1000
    println(n.toByte())
    println(n.toShort())
    println(n.toChar())
    println(n.toLong())

    println(1_000_000_000_000.toFloat().toLong()) // 정밀도 잃음
}
