package ch02

// 2.1.4 실습

fun main() {
    val a = 10
//    a = 20 -> val은 재할당 불가
    println(a)

    var b = 1
    b = b + 2
    b = b * 3
    println(b)

    b += 4
    b *= 5
    println(b)

    b /= 6
    println(b)

    b %= 7
    println(b)

    var c = 0
    println(c++)
    println(c)
    println(++c)
    println(c)
    println(c--)
    println(c)
    println(--c)
    println(c)
}
