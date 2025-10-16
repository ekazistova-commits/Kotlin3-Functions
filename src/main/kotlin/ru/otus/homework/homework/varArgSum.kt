package ru.otus.homework.homework

fun main() {
//    check(3 == varArgSum(1, 2))
//    check(6 == varArgSum(1, 2, 3))
//    check(10 == varArgSum(1, 2, 3, 4))

    fun varArgSum(a1: Int, a2: Int, vararg numbers: Int): Int {
        val varargSum = numbers.sum()
        val result = a1 + a2 + varargSum
        println("a1 = $a1, a2 = $a2, vararg sum = $varargSum, результат = $result")
        return result

    }

//примеры использования:
//val result0 = varArgSum(1)                    // не выполнится
    val result1 = varArgSum(1, 2, 3)                 // 6
    val result2 = varArgSum(1, 2, 3, 4, 5)           // 15
    val result3 = varArgSum(100, 0)                                // 100
    val result4 = varArgSum(0, 0, 30)                 // 30
    val result5 = varArgSum(10, 20, 13, 14, 15)      // 72
}

