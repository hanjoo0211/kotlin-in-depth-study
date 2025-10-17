package ch06

// 6.1.3 실습
//enum class Direction {
//    NORTH, SOUTH, EAST, WEST
//}

fun main() {
    println(Direction.EAST.name) // EAST
    println(Direction.EAST.ordinal) // 2
    println(Direction.NORTH < Direction.SOUTH) // true

    println(Direction.valueOf("WEST")) // WEST
    println(Direction.values()[1]) // SOUTH
    println(Direction.entries[1]) // SOUTH

    println(enumValueOf<Direction>("WEST")) // WEST
    println(enumValues<Direction>()[1]) // SOUTH
}
