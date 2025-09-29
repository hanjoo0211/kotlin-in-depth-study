package ch05

// 5.1.6 실습
fun forEach(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

inline fun forEachInline(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

inline fun forEachInLineRun(a: IntArray, crossinline action: (Int) -> Unit) = object {
    fun run() {
        for (n in a) action(n)
    }
}

//fun main() {
//    forEach(intArrayOf(1, 2, 3, 4)) {
//        if (it < 2 || it > 3) return@forEach
//        println(it)
//    }
//}

//fun main() {
//    forEach(intArrayOf(1, 2, 3, 4), fun(it: Int) {
//        if (it < 2 || it > 3) return
//        println(it)
//    })
//}

//fun main() {
//    forEachInline(intArrayOf(1, 2, 3, 4)) {
//        if (it < 2 || it > 3) return
//        println(it)
//    }
//}

fun main() {
    forEachInLineRun(intArrayOf(1, 2, 3, 4)) {
        if (it < 2 || it > 3) return@forEachInLineRun
        println(it)
    }
}