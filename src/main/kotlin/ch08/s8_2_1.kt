package ch08

// 8.2.1 실습
abstract class Entity21(val name: String)

//class Person21(name: String, val age: Int) : Entity21(name)

class Person21: Entity21 {
    constructor(name: String) : super(name)

    constructor(firstName: String, lastName: String) : super("$firstName $lastName")
}

//val entity = Entity("Unknown")

abstract class Shape {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override val width: Double = radius * 2
    override val height: Double = radius * 2
    override fun area() = Math.PI * radius * radius
}

class Rectangle(
    override val width: Double,
    override val height: Double
) : Shape() {
    override fun area() = width * height
}

fun main() {
    println(Circle(4.0).area())
    println(Rectangle(4.0, 5.0).area())
}
