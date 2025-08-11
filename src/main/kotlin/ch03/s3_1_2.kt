package ch03

// 3.1.2 실습

fun rectangleArea(width: Double, height: Double): Double {
    println("width: $width, height: $height")
    return width * height
}

fun main() {
    val w = 5.0
    val h = 10.0
    rectangleArea(w, h)
    rectangleArea(height = h, width = w) // named arguments
}