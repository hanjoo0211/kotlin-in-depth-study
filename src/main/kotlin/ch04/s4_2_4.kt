package ch04

// 4.2.4 실습
fun readInt() = readLine()?.toInt()

fun readInt2(): Int? {
    val tmp = readLine()
    return if (tmp != null) tmp.toInt() else null
}

fun main() {

}