package ch05

// 5.1.3 실습
fun aggregate3(numbers: IntArray, op: (Int, Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("빈 배열")

    for (i in 1..numbers.lastIndex) result = op(result, numbers[i])
    return result
}

fun sum3(numbers: IntArray) = aggregate(numbers) { result, op -> result + op }

fun max3(numbers: IntArray) = aggregate(numbers, {result, op -> if (op > result) op else result})

fun check(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun sum31(numbers: IntArray) = aggregate3(numbers, fun(result, op) = result + op)

fun sum32(numbers: IntArray) = aggregate3(numbers, fun(result, op): Int { return result + op })

fun main() {
    println(sum3(intArrayOf(1, 2, 3)))
    println(max3(intArrayOf(1, 2, 3)))

    println(check("Hello") { c -> c.isLetter() })
    println(check("Hello") { it.isLetter() })
}
