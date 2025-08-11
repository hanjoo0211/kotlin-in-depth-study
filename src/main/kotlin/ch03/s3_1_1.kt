package ch03

// 3.1.1 실습
import kotlin.math.PI

fun circleArea(radius: Double): Double {
    return PI * radius * radius
}

fun increment(a: IntArray): Int {
    a[0] = a[0] + 1
    return a[0]
}

fun main() {
    print("Enter radius: ")
    val radius = readLine()!!.toDouble()
    println("Circle area: ${circleArea(radius)}")

    val a = intArrayOf(1, 2, 3)
    println("Before increment: ${a[0]}")
    println("After increment: ${increment(a)}")
    println("Array after increment: ${a.joinToString(", ")}")
}