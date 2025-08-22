package ch04

// 4.2.1 실습
fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun main() {
    println(isLetterString("abc"))
//    println(isLetterString(null))

    val s: String? = "abc"
//    val ss: String = s
}