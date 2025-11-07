package ch08

// 8.1.1 실습
open class Vehicle {
    var currentSpeed = 0

    open fun start() {
        println("Vehicle started")
        onstart()
    }

    fun stop() {
        println("Vehicle stopped")
    }

    protected open fun onstart() {
        println("Vehicle is starting")
    }
}

open class FlyingVehicle : Vehicle() {
    fun takeOff() {
        println("Taking off")
    }

    fun land() {
        println("Landing")
    }
}

class Aircraft(val seats: Int) : FlyingVehicle()



open class Person(val name: String, val age: Int) {
    companion object : Person("Unknown", 0)
}

object JohnDoe : Person("John Doe", 30)



class Car: Vehicle() {
//    override fun start() {
//        println("Car started")
//    }
    override fun onstart() {
        println("Car is starting")
        super.onstart()
    }
}

class Boat: Vehicle() {
    override fun start() {
        println("Boat started")
    }
}



fun Vehicle.accelerate() {
    println("Vehicle accelerated")
}

fun Car.accelerate() {
    println("Car accelerated")
}


open class Entity {
    open val name: String get() = ""
}

class User(override val name: String) : Entity()

fun main() {
    val aircraft = Aircraft(150)
    val vehicle: Vehicle = aircraft
    vehicle.start()
    vehicle.stop()
    aircraft.start()
    aircraft.takeOff()
    aircraft.land()
    aircraft.stop()
    println(aircraft.seats)

    val vehicle2: Vehicle = Car()
    vehicle2.start() // Car started
    vehicle2.stop() // Vehicle stopped

    val car = Car()
    car.start() // Car started + Car is starting
//    car.onstart() // error: 'onstart' has protected access in 'Vehicle'
}