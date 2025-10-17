package ch06

// 6.1.2 실습
enum class WeekDay {
    MONDAY { fun startWork() = println("Work week started")},
    TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val lowerCaseName get() = name.lowercase()
    fun isWeekEnd() = this == SATURDAY || this == SUNDAY
}

enum class WeekDayWithMessage {
    MONDAY {
        override fun dayMessage() = "Start of the work week"
    },
    TUESDAY {
        override fun dayMessage() = "Second day of the work week"
    },
    WEDNESDAY {
        override fun dayMessage() = "Midweek day"
    },
    THURSDAY {
        override fun dayMessage() = "Almost the weekend"
    },
    FRIDAY {
        override fun dayMessage() = "Last workday of the week"
    },
    SATURDAY {
        override fun dayMessage() = "It's the weekend!"
    },
    SUNDAY {
        override fun dayMessage() = "Rest and recharge"
    };

//    abstract fun dayMessage(): String // 각 enum 상수에서 구현해야 하는 추상 메서드
    open fun dayMessage() = "Just another day"
}

enum class HttpStatusCode(val code: Int) {
    OK(200),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    fun isSuccess() = code in 200..299
}

fun main() {
    println(WeekDay.MONDAY.isWeekEnd()) // false
    println(WeekDay.SATURDAY.lowerCaseName) // saturday

    println(HttpStatusCode.OK.isSuccess()) // true
    println(HttpStatusCode.NOT_FOUND.isSuccess()) // false

    // WeekDay.MONDAY.startWork() // Error - Unresolved reference: startWork
}
