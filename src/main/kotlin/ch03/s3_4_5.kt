package ch03

// 3.4.5 예제 파일
import java.math.BigInteger

fun factorialRec(n: Int): BigInteger {
    return if (n <= 0) 1.toBigInteger() else n.toBigInteger() * factorial(n - 1)
}

tailrec fun factorial(n: Int, result: BigInteger = 1.toBigInteger()): BigInteger {
    return if (n <= 0) result else factorial(n - 1, result * n.toBigInteger())
}

fun main() {
    println(factorial(50000))
}