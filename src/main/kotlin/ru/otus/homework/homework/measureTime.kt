package ru.otus.homework.homework

fun main() {
    val time = measureTime {
        longRunningTask()
    }
    println("Measured time for longRunningTask(): $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}