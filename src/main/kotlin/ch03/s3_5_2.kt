package ch03

// 3.5.2 예제 파일
fun readIntNum(): Int {
    try {
        return readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        println("${e.message} - Please enter a valid integer.")
        return -1
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
        return -1
    } finally {
        println("Execution completed.")
    }
}

fun main() {
    readIntNum()
}
