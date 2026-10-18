package org.example

fun main() {
    // === Целочисленные типы ===
    val byteVar: Byte = 127
    val shortVar: Short = 32767
    val intVar: Int = 2_147_483_647
    val longVar: Long = 9_223_372_036_854_775_807L

    // === Типы с плавающей точкой ===
    val floatVar: Float = 3.14f
    val doubleVar: Double = 3.14159265358979

    // === Символьный тип ===
    val charVar: Char = 'A'

    // === Логический тип ===
    val booleanVar: Boolean = true

    // === Строки ===
    val stringVar: String = "Hello, Kotlin!"
    val multiLineString: String = """
        Многострочная
        строка
    """.trimIndent()

    // === Массивы ===
    val intArray: IntArray = intArrayOf(1, 2, 3)
    val stringArray: Array<String> = arrayOf("a", "b", "c")

    // === Коллекции ===
    val listVar: List<Int> = listOf(1, 2, 3)
    val mutableListVar: MutableList<Int> = mutableListOf(1, 2, 3)
    val setVar: Set<String> = setOf("a", "b")
    val mapVar: Map<String, Int> = mapOf("один" to 1, "два" to 2)

    // === Специальные типы ===
    val anyVar: Any = "может хранить любой тип"
    val unitVar: Unit = Unit
    val nothingExample: Nothing? = null

    // === Nullable-типы ===
    val nullableString: String? = null
    val nullableInt: Int? = 42

    // === Изменяемые переменные (var) ===
    var counter: Int = 100
    var name: String = "Bob"

    // === Вывод значений ===
    println("Byte: $byteVar")
    println("Short: $shortVar")
    println("Int: $intVar")
    println("Long: $longVar")
    println("Float: $floatVar")
    println("Double: $doubleVar")
    println("Char: $charVar")
    println("Boolean: $booleanVar")
    println("String: $stringVar")
    println("List: $listVar")
    println("Map: $mapVar")
    println("Nullable: $nullableString")
    println("Counter: $counter")
    println("String: $name")
}
