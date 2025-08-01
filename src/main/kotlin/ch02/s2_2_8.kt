package ch02

// 2.2.8 실습

fun main() {
    println(1 > 2)
    println(1 < 2)
    println(1 >= 2)
    println(1 <= 2)
    println(1 == 2)
    println(1 != 2)
    println(1 >= 1)
    println(1 <= 1)
    println(1 == 1)
    println(1 != 1)
//    println(1 == 1L) // 타입이 다르면 비교할 수 없음

    println(true > false)
    println('a' < 'b')

    println(Double.NaN)
    println(Double.NaN == Double.NaN) // NaN은 자기 자신과 같지 않음
    println(Double.NaN != Double.NaN)
    println(Double.NaN < Double.NaN) // NaN은 어떤 값보다도 작지 않음
    println(Double.NaN > Double.NaN) // NaN은 어떤 값보다도 크지 않음
}
