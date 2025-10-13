package ch05

// 5.5.1 실습
class Address {
    var zipcode: Int = 0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String) {
        println("$zipcode $city $street $house: $message")
    }
}

class Address2(var city: String, var street: String, var house: String) {
    fun asText() = "$city, $street, $house"
    fun post(message: String) {}
}

fun Address.showCityAddress() = println("$street, $house")

fun main() {
    Address().run {
        zipcode = 123456
        city = "Seoul"
        street = "Gangnam-daero"
        house = "1234"
        showCityAddress()
    }

    val message = with(Address2("Seoul", "Gangnam-daero", "1234")) {
        "Address: $city, $street, $house"
    }
    println(message)

//    val address = run {
//        val city = readLine() ?: return
//        val street = readLine() ?: return
//        val house = readLine() ?: return
//        Address2(city, street, house)
//    }
//    println(address.asText())

    Address2("Seoul", "Gangnam-daero", "1234").let {
        println("To city: ${it.city}")
        it.post("Hello")
    }

    Address2("Seoul", "Gangnam-daero", "1234").let { addr ->
        println("To city: ${addr.city}")
        addr.post("Hello")
    }

    Address().apply {
        zipcode = 123456
        city = "Seoul"
        street = "Gangnam-daero"
        house = "1234"
    }.post("Hello")

    Address().also {
        it.zipcode = 123456
        it.city = "Seoul"
        it.street = "Gangnam-daero"
        it.house = "1234"
    }.post("Hello")
}