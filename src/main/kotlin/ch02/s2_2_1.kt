package ch02

// 2.2.1 실습

fun main() {
    val one: Byte = 1
    val million = 1_000_000 // Int로 추론
    val tenBillion = 10_000_000_000 // Long으로 추론

    val hundredLong = 100L // Long 타입으로 명시

    println("${Short.MIN_VALUE}, ${Short.MAX_VALUE}, ${Int.MIN_VALUE}, ${Int.MAX_VALUE}, " +
            "${Long.MIN_VALUE}, ${Long.MAX_VALUE}, ${Float.MIN_VALUE}, ${Float.MAX_VALUE}, " +
            "${Double.MIN_VALUE}, ${Double.MAX_VALUE}")
}
