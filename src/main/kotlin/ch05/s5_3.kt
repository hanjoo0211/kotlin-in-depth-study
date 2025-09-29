package ch05

// 5.3 실습
val IntRange.leftHalf: IntRange
    get() = start..(start + endInclusive) / 2

fun main() {
    println((1..3).leftHalf)
    println((3..6).leftHalf)
}