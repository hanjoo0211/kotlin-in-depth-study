package ch05

// 5.5.2 실습
class Address552(val city: String, val street: String, val house: String)

class Person552(val firstName: String, val lastName: String) {
    fun Address552.post(message: String) {
        val city = city // 암시적 this: 확장 수신 객체(Address552)
        val street = this.street // 한정시키지 않은 this: 확장 수신 객체(Address552)
        val house = this@post.house // 한정시킨 this: 확장 수신 객체(Address552)
        val firstName = firstName // 암시적 this: 디스패치 수신 객체(Person552)
        val lastName = this@Person552.lastName // 한정시킨 this: 디스패치 수신 객체(Person552)

        println("$city, $street, $house, $firstName, $lastName")
        println(message)
    }

    fun test(address: Address552) {
        // 디스패치 수신 객체(Person552): 암시적
        // 확장 수신 객체(Address552): 명시적
        address.post("Hello")
    }
}

fun main() {
    val address = Address552("Seoul", "Gangnam-daero", "1234")
    Person552("John", "Doe").test(address)
}