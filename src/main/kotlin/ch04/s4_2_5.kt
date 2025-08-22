package ch04

// 4.2.5 실습
fun sayHello(name: String?) {
    println("Hello " + (name ?: "World") + "!")
}

fun sayHello2(name: String?) {
    println("Hello " + (if (name != null) name else "World") + "!")
}

fun main() {
    sayHello("John")
    sayHello(null)
}