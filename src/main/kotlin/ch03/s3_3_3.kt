package ch03

// 3.3.3 예제 파일

fun main() {
    val n = readLine()!!.toInt()
//    when {
//        n < 0 -> println("음수입니다.")
//        n == 0 -> println("0입니다.")
//        else -> println("양수입니다.")
//    }
    when (n) {
        in Int.MIN_VALUE until 0 -> println("음수입니다.")
        0 -> println("0입니다.")
        else -> println("양수입니다.")
    }
}