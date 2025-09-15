package ch05

// 5.1.2 실습

fun main() {
    val lessThan: (Int, Int) -> Boolean = { a, b -> a < b }
    println(lessThan(1, 2))

    val lessThan2 = { a: Int, b: Int -> a < b }
    println(lessThan2(2, 1))

    val shifter: (Int) -> (Int) -> Int = { n -> { i -> i + n } }
    val inc = shifter(1)
    val dec = shifter(-1)

    println(inc(10))
    println(dec(10))
}
