package ch08

// 8.1.2 실습
open class Vehicle2 {
    init {
        println("Vehicle2 initialized")
    }
}

open class Car2: Vehicle2() {
    init {
        println("Car2 initialized")
    }
}

open class Truck2: Car2() {
    init {
        println("Truck2 initialized")
    }
}


open class Person2(val name: String, val age: Int)

class Student2(name: String, age: Int, val university: String): Person2(name, age)


open class Person22 {
    val name: String
    val age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

class Student22(name: String, age: Int, val university: String): Person22(name, age)


class Student23: Person2 {
    val university: String

    constructor(name: String, age: Int, university: String): super(name, age) {
        this.university = university
    }
}


open class Person222(val name: String, val age: Int) {
    open fun showInfo() {
        println("Name: $name, Age: $age")
    }

    init {
        showInfo()
    }
}

class Student222(name: String, age: Int, val university: String): Person222(name, age) {
    override fun showInfo() {
        println("Name: $name, Age: $age, University: $university")
    }
}

fun main() {
    Truck2()

    Student2("Alice", 20, "Wonderland University")

    Student222("Alice", 20, "Wonderland University")
}
