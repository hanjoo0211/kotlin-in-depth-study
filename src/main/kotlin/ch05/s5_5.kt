package ch05

// 5.5 실습
fun aggregate55(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("빈 배열")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun Int.max(other: Int) = if (this > other) this else other

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4)
    println(aggregate55(numbers, Int::plus))
    println(aggregate55(numbers, Int::max))
}