package ch03

// 3.3.2 예제 파일

fun main() {
    val chars = 'a'.. 'z'
    val numbers = 1..10
    val zero2One = 0.0..1.0

    println('c' in chars)

    println("Hello".substring(1..2))
    println("Hello".substring(1 until 3))
    println("Hello".substring(1, 3))
}