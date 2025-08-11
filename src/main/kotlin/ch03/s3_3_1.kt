package ch03

// 3.3.1 예제 파일
fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(1, 2))
    val result = if (max(1, 2) > 0) {
        "Positive"
    } else "Negative or Zero"
    println(result)
    
    val result2 = if (-max(1, 2) > 0) "Positive" else return
    println(result2)
}