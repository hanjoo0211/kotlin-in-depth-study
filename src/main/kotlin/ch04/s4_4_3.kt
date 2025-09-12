package ch04

// 4.4.3 실습

fun main() {
    fun midPoint(xRange: IntRange, yRange: IntRange) = object {
        val x = (xRange.first + xRange.last) / 2
        val y = (yRange.first + yRange.last) / 2
    }

    val midPoint = midPoint(1..5, 2..6)

    println("${midPoint.x}, ${midPoint.y}")

    val o = object {
        val x = 0
        val y = 0
    }

    println("${o.x}, ${o.y}")
}