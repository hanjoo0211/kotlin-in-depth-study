package ch02

// 2.3.1 실습
import java.util.Date

fun main() {
    val hello = "Hello"
    val text = "Hello, world! \nThis is \"multiline\" string"
    println(hello)
    println(text)

    val name = "Hanjoo"
    println("Hello, $name!\n Today is ${Date()}")

    val message = """
        Hello, $name!
        Today is ${Date()}
        This is a multiline string.
    """.trimIndent()
    println(message)
}
