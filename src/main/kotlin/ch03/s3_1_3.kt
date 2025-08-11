package ch03

// 3.1.3 실습
fun readInt() = readLine()!!.toInt()
fun readInt(radix: Int) = readLine()!!.toInt(radix)

fun main() {
    println("Enter an integer:")
    val num1 = readInt()
    println("You entered: $num1")

    println("Enter an integer in hexadecimal (base 16):")
    val num2 = readInt(16)
    println("You entered: $num2")
}