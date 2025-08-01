package ch02

// 2.4.1 실습

fun main() {
    val a = emptyArray<String>() // Array<String> 타입의 빈 배열
    val b = arrayOf("a", "b", "c") // Array<String> 타입의 원소 3개 배열
    val c = arrayOf(1, 2, 3) // Array<Int> 타입의 원소 3개 배열

    val d = IntArray(10) {it}
    for (i in d) {
        println(i) // 0, 1, 2
    }
}
