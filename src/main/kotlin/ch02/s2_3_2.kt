package ch02

// 2.3.2 실습

fun main() {
    println("ch02, 2.3.2 실습".length)
    println("ch02, 2.3.2 실습".lastIndex)

    val s = "ch02, 2.3.2 실습"
    println(s[0])
    println(s[1])
    println(s[10])
//    println(s[15]) // StringIndexOutOfBoundsException 발생

    val sum = 10
    val s2 = "sum 값은 " + sum + " 입니다."
    println(s2)
    val s3 = "sum 값은 $sum 입니다."
    println(s3)

    println("Hello" == "Hel" + "lo")
    println("Hello" === "Hel" + "lo") // true
}
