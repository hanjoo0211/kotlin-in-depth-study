package ch08

// 8.2.2 실습
interface Vehicle822 {
    val currentSpeed: Int
    fun move()
    fun stop()
}

interface Car822 {
    fun ride()
}

interface Aircraft822 {
    fun fly()
}

interface Ship822 {
    fun sail()
}

interface FlyingCar822 : Car822, Aircraft822

class Transformer : FlyingCar822, Ship822 {
    override fun ride() {
        println("Riding the Transformer")
    }
    override fun fly() {
        println("Flying the Transformer")
    }
    override fun sail() {
        println("Sailing the Transformer")
    }
}

fun main() {
    
}
