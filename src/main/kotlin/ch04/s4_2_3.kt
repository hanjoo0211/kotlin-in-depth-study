package ch04

// 4.2.3 실습

fun main() {
    var name: String? = null

    fun initialize() {
        name = "John"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }

//    initialize()
    sayHello()
}