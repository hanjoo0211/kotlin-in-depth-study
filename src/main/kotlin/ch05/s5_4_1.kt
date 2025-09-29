package ch05

// 5.4.1 실습
fun aggregate541(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun sum541(numbers: IntArray) = aggregate541(numbers) { op -> this + op }

fun sum5411(numbers: IntArray) = aggregate541(numbers, fun Int.(op: Int) = this + op)

fun main() {
    println(sum541(intArrayOf(1, 2, 3, 4)))
}
