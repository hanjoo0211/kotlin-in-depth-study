package ch08

// 8.1.3 실습
val objects = arrayOf("1", 2, "3", 4)

fun main() {
    for (obj in objects) {
        println(obj is Int)
    }

    println(null is Int)
    println(null is Int?)

    println(12 is String)

    val o: Any = 123
    println((o as Int) + 1)
    println((o as? Int)!! + 1)
    println((o as? String))
    println((o as String))
}
