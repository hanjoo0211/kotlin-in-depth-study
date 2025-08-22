package ch04

// 4.2.2 실습
fun isLetterString2(s: String?): Boolean {
    if (s == null) return false
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun main() {
    println(isLetterString2("abc"))
//    println(isLetterString(null))

    val s: String? = "abc"
//    val ss: String = s
}