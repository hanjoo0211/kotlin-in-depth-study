package ch03

// 3.4.3 예제 파일

fun main() {
    val text = "Hello, Kotlin!"
    for (i in text.indices) {
        if (text[i] == 'K') {
            println("Found 'K' at index $i")
            break
        } else if (text[i] == 'l'){
            continue
        } else {
            println("Character at index $i: ${text[i]}")
        }
    }
}