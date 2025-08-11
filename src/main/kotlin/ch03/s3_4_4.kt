package ch03

// 3.4.4 예제 파일

fun main() {
    val text = "Hello, Kotlin!"
    outerLoop@ for (i in text.indices) {
        for (j in 0..2) {
            if (text[i] == 'K' && j == 2) {
                println("Found 'K' at index $i")
                break@outerLoop
            } else if (text[i] == 'l') {
//                continue@innerLoop
                continue
            } else {
                println("Character at index $i: ${text[i]}")
            }
        }
        println("inner loop completed for index $i")
    }
    println("Loop completed")
}