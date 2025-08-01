package ch02

// 2.2.3 실습

fun main() {
    println(7 / 4)
    println((-7) / 4)
    println(7 % 4)
    println((-7) % 4)
    println(7.floorDiv(4))
    println((-7).floorDiv(4)) // 음수 나눗셈의 몫
    println(7.mod(4))
    println((-7).mod(4)) // 음수 나눗셈의 나머지

    val a: Long = 1_000_000_000_000L
    val b: Float = .25f
    val c = a * b // Long * Float = Float
    println("c의 값: $c, c의 타입: ${c::class.simpleName}")
}
