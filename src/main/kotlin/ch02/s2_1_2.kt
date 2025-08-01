package ch02

// 2.1.2 실습

fun main() {
    val timeInSeconds = 15
    println(timeInSeconds)

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)

    val c: Int = readLine()!!.toInt() // 타입 명시
    val d: String = readLine()!!
    println(c.toString() + d)

    val e: Int // 초깃값 없이 선언
    e = 5
    println(e)
}
