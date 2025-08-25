package ch04

// 4.3.2 실습
lateinit var text: String

fun readText() {
    text = readLine()!!
}

fun readText2() {
    lateinit var text2: String
    text2 = readLine()!!
    println(text2)
}

fun main() {
    readText()
    println(text)
}