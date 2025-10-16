package ru.otus.homework.homework

fun main() {
//    check("str1 str2 str3" == concatStrings("str1", "str2", "str3"))

    testingConcatStrings()

    println("\n=== Примеры использования concatStrings ===")
    // Объединение с пробелом (по умолчанию)
    val result1 = concatStrings("Hello", "world", "!")
    println(result1)  // "Hello world !"

    // Объединение с ?
    val result2 = concatStrings("Что", "Где", "Когда", separator = '?')
    println(result2)  // "Что?Где?Когда"

    // формат даты с /
    val result3 = concatStrings("2025", "10", "16", separator = '/')
    println(result3)  // "2025/10/16"

    // без разделителя
    val result4 = concatStrings("You are downloading", "an Eclipse Temurin build, the open-source community", "build from the Eclipse Adoptium Working Group. If the download doesn't start in a few seconds, please click here to start the download.", separator = ' ')
    println(result4)  // "You are downloading an Eclipse Temurin build, the open-source community build from the Eclipse Adoptium Working Group. If the download doesn't start in a few seconds, please click here to start the download."
}
fun concatStrings(vararg strings: String, separator: Char = ' '): String {
        return strings.joinToString(separator.toString())
    }
    fun printConcatenatedStrings(vararg strings: String, separator: Char = ' ') {
        val result = concatStrings(*strings, separator = separator)
    }

    fun testingConcatStrings() {
        println("=== Функция-тест для concatStrings ===")

        // Тест 1: Разделитель пробел
        val result1 = concatStrings("str1", "str2", "str3")
        val expected1 = "str1 str2 str3"
        val test1Passed = result1 == expected1

        // Тест 2: Разделитель запятая
        val result2 = concatStrings("str1", "str2", "str3", separator = ',')
        val expected2 = "str1,str2,str3"
        val test2Passed = result2 == expected2

        // Тест 3: Одна строка
        val result3 = concatStrings("single")
        val expected3 = "single"
        val test3Passed = result3 == expected3

        // Вывод результатов
        println("Тест 1 (пробел): ${if (test1Passed) "✅" else "❌"} '$result1'")
        println("Тест 2 (запятая): ${if (test2Passed) "✅" else "❌"} '$result2'")
        println("Тест 3 (одна строка): ${if (test3Passed) "✅" else "❌"} '$result3'")
    }