package ch03

// 3.1.4 실습
internal fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

fun main() {
    printSorted(6, 3, 8, 1, 4)
    printSorted(10, 20, 30, -1, -9)

    val a = intArrayOf(5, 2, 9, 1, 3)
    printSorted(*a) // Spread operator to pass array as vararg
    println(a.contentToString())
}