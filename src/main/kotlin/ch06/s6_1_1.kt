package ch06

// 6.1.1 실습
enum class Direction {
    NORTH, SOUTH, EAST, WEST,
//    NORTH_EAST, SOUTH_EAST, SOUTH_WEST, NORTH_WEST
}

fun rotateClockWise(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

fun main() {
    println(rotateClockWise(Direction.NORTH)) // EAST
}
