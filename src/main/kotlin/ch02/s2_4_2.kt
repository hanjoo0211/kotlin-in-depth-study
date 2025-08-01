package ch02

// 2.4.2 실습

fun main() {
    val squares = arrayOf(1, 4, 9 ,16)
    for (i in squares.indices) {
        println("squares[$i] = ${squares[i]}")
    }

    squares[2] = 100 // 배열은 val로 선언해도 원소를 변경할 수 있음
    squares[0]--
    for (i in squares.indices) {
        println("squares[$i] = ${squares[i]}")
    }

    val numbers = squares
    numbers[1] = 200 // numbers는 squares와 같은 배열을 참조함
    for (i in squares.indices) {
        println("squares[$i] = ${squares[i]}") // squares도 변경됨
    }

    val numbers2 = squares.copyOf() // squares의 복사본을 만듦
    numbers2[1] = 300 // numbers2는 squares와 다른 배열을 참
    for (i in squares.indices) {
        println("squares[$i] = ${squares[i]}") // squares는 변경되지 않음
    }

    val strings = arrayOf("a", "b", "c")
//    val objects: Array<Any> = strings // Array<String> 타입은 Array<Any> 타입으로 변환할 수 없음

    val b = intArrayOf(1, 2, 3) + 4
    println(b.joinToString()) // intArrayOf(1, 2, 3, 4)와 같음

    val c = intArrayOf(1, 2, 3) + intArrayOf(4, 5, 6)
    println(c.joinToString()) // intArrayOf(1, 2, 3, 4, 5, 6)와 같음

    println(intArrayOf(1, 2, 3) == intArrayOf(1, 2, 3)) // false, 다른 배열
    println(intArrayOf(1, 2, 3) === intArrayOf(1, 2, 3)) // false, 다른 배열 참조
    println(intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3))) // true, 같은 내용의 배열
}
