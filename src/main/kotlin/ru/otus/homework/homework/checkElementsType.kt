@file:Suppress("SimplifyBooleanWithConstants")

package ru.otus.homework.homework

fun main() {
    val list1: Collection<Any> = listOf("a", "b", "c")
    val list2: Collection<Any> = listOf(1, 2, "c")
    val list3: Collection<Any> = listOf(1, 2, 3)

    println("=== Проверка типов элементов в коллекциях ===")

    println("list1 = $list1")
    println("Все элементы типа String? ${list1.checkElementsType<String>()}")
    println()

    println("list2 = $list2")
    println("Все элементы типа Int? ${list2.checkElementsType<Int>()}")
    println()

    println("list3 = $list3")
    println("Все элементы типа Int? ${list3.checkElementsType<Int>()}")
    println()

    // Проверки
    check(true == list1.checkElementsType<String>())
    check(false == list2.checkElementsType<Int>())
    check(true == list3.checkElementsType<Int>())
}

inline fun <reified T> Collection<Any>.checkElementsType(): Boolean {
    return this.all { it is T }
}
