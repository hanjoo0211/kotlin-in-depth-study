package ch03

// 3.4.2 예제 파일

fun main() {
    val squares = IntArray(10) { it * it }
    var sum = 0

    for (x in squares) {
        sum += x
    }
    println("Sum of squares: $sum")

    val text = "Hello, World!"
    for (i in text.indices) {
        println("Character at index $i: ${text[i]}")
    }
}