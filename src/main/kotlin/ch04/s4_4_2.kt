package ch04

// 4.4.2 실습
class Application2 private constructor(val name: String) {
    object Factory {
        fun create(args: Array<String>): Application2? {
            val name = args.firstOrNull() ?: return null
            return Application2(name)
        }
    }
}

class Application21 private constructor(val name: String) {
    companion object Factory {
        fun create(args: Array<String>): Application21? {
            val name = args.firstOrNull() ?: return null
            return Application21(name)
        }
    }
}

fun main() {
//    val app = Application2("123")
    val app = Application2.Factory.create(arrayOf("My Application"))
    println(app?.name)

    val app2 = Application21.create(arrayOf("My Application 21"))
    println(app2?.name)
}