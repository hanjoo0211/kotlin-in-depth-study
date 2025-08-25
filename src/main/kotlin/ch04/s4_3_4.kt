package ch04

// 4.3.4 실습
import java.io.File

val text434 by lazy {
    File("data.txt").readText()
}

fun main() {
    while (true) {
        when (val command = readLine() ?: return) {
            "print data" -> println(text434)
            "exit" -> return
        }
    }
}