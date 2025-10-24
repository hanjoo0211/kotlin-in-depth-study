package ch06

// 6.2.1 실습
class NormalPerson(val firstName: String, val lastName: String)

data class DataPerson(val firstName: String, val lastName: String)

data class NormalPersonBox(val address: String, val person: NormalPerson)

data class DataPersonBox(val address: String, val person: DataPerson)

fun main() {
    val normalPerson1 = NormalPerson("John", "Doe")
    val normalPerson2 = NormalPerson("John", "Doe")
    val normalPerson3 = normalPerson1
    println("NormalPerson equals: ${normalPerson1 == normalPerson2}") // false
    println("NormalPerson reference equals: ${normalPerson1 == normalPerson3}") // true
    println(normalPerson1)

    val dataPerson1 = DataPerson("John", "Doe")
    val dataPerson2 = DataPerson("John", "Doe")
    println("DataPerson equals: ${dataPerson1 == dataPerson2}") // true
    println(dataPerson1)

    val normalPersonBox1 = NormalPersonBox("Seoul", normalPerson1)
    val normalPersonBox2 = NormalPersonBox("Seoul", normalPerson2)
    println("NormalPersonBox equals: ${normalPersonBox1 == normalPersonBox2}")

    val dataPersonBox1 = DataPersonBox("Seoul", dataPerson1)
    val dataPersonBox2 = DataPersonBox("Seoul", dataPerson2)
    println("DataPersonBox equals: ${dataPersonBox1 == dataPersonBox2}")

    val pair = Pair("Hello", 42)
    val triple = Triple("Hello", 42, 3.14)
    println("Pair: $pair")
    println("Triple: $triple")
}