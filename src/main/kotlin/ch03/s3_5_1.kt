package ch03

// 3.5.1 예제 파일

fun main() {
    val input = readLine()!!.toInt()
    if (input < 0) throw IllegalArgumentException("Input must be non-negative")
}