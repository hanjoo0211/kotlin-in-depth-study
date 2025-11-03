package ch06

// 6.3.1 실습
@JvmInline
value class Dollar(val amount: Int) {
    fun add(d: Dollar) = Dollar(amount + d.amount)
    val isDebt get() = amount < 0
}
@JvmInline
value class Euro(val amount: Int)

fun safeAmount(dollar: Dollar?) = dollar?.amount ?: 0

fun main() {
//    println(Dollar(15).add(Dollar(20)).amount)
//    println(Dollar(-5).isDebt)

    println(Dollar(15).amount)
    println(Dollar(15))
    println(safeAmount(Dollar(15)))
}