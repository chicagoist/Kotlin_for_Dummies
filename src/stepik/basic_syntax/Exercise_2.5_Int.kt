package stepik.basic_syntax

/* 2.5

Исправьте программу, чтобы она успешно компилировалась и выводила корректный результат умножения двух чисел

Sample Input:

8
11
Sample Output:

88

main () {
    val first : Int = readln()
    val second : Int = readln()
    val result = First * Second
    println("result")
}

*/

fun main() {
    val first: Int = readln().toIntOrNull() ?: 0
    val second: Int = readln().toIntOrNull() ?: 0
    val result = first * second
    println(result)
}

/*
fun main() {

    var firstPersonAge: Int = 0
    var secondPersonAge: Int = 0

    print("Введите возраст первого человека: ")
    firstPersonAge = readln().toInt()

    print("Введите возраст второго человека: ")
    secondPersonAge = readln().toInt()

    println("Первый человек старше второго на ${firstPersonAge - secondPersonAge} лет")

}
*/

/*
📑 Cheat Sheet по уроку 2.5

val number: Int = "42".toInt() // Базовый способ, кидает исключение при ошибке

// Предпочтительный способ: безопасное преобразование с обработкой null
val input: String = readln()
val number: Int? = input.toIntOrNull() // Вернет число (Int) или null, если не число

if (number != null) {
    println("Вы ввели число: $number")
} else {
    println("Ошибка: '$input' не является числом.")
}

// Можно использовать с Elvis-оператором (?:) для значения по умолчанию
val validNumber: Int = input.toIntOrNull() ?: 0 // Если null, то подставится 0
println("Результат: ${validNumber * 2}")

Int? означает "Nullable Int", то есть "целое число, которое может быть равно null".

Int — гарантированно содержит число (например, 42, 0, -15). Не может быть null.

Int? — может содержать число (42, 0, -15) или специальное значение null (обозначающее "ничего", "отсутствие значения").

 Подробное объяснение (с примерами)
Вот как это работает в твоём коде:


val input: String = readln() // Мы читаем строку из консоли
val number: Int? = input.toIntOrNull() // Пытаемся преобразовать строку в число
Что происходит:

Метод toIntOrNull() пытается превратить строку "123" в число 123.

Если это удаётся (например, пользователь ввёл "88"), то number будет равно 88.

Если это НЕ удаётся (пользователь ввёл "hello" или оставил пустую строку), метод не "ломает" программу (не выбрасывает исключение), а вежливо возвращает специальное значение null.

Тип переменной number — Int?, что говорит компилятору: "Внимание! Эта переменная может быть равна null. Работая с ней, нужно быть осторожным."

Почему это важно? Безопасность работы с null
Kotlin строго следит за тем, чтобы ты случайно не использовал null там, где его быть не должно. Это предотвращает ужасную ошибку NullPointerException (NPE), которая часто встречается в Java.

Компилятор Kotlin НЕ даст тебе сделать так:

val number: Int? = null
val result = number * 2 // ОШИБКА КОМПИЛЯЦИИ!
// Компилятор: "Стоп! number может быть null, это небезопасно!"

✅ Как правильно работать с Int? (Nullable-типами)
Есть несколько идиоматичных способов обойти защиту компилятора:

1. Проверка на null (if)
Проверяем, не null ли значение, и если нет — работаем с ним.

val number: Int? = readln().toIntOrNull()

if (number != null) {
    // В этой области компилятор УЖЕ знает, что number - это точно Int (не null)
    val result = number * 2
    println(result)
} else {
    println("Вы ввели не число!")
}

2. Elvis-оператор (?:)
Это способ сказать: "Если значение null, то используй вот это значение по умолчанию".

val number: Int? = readln().toIntOrNull()
val validNumber: Int = number ?: 0 // Если number null, то validNumber = 0
val result = validNumber * 2 // Всегда можно умножить, т.к. validNumber точно Int

Именно этот способ ты видел в коде для Laundry App:
val washTime = washTimeString.toIntOrNull() ?: 30
Перевод на русский: "Преобразуй строку в число. Если получилось null (не удалось преобразовать), то присвой переменной washTime число 30."

3. Безопасный вызов (?.)
Если нужно вызвать метод у объекта, который может быть null.

val number: Int? = readln().toIntOrNull()
val doubleNumber: Int? = number?.times(2) // Если number не null, то умножит на 2.
// Если number null, то и doubleNumber будет null.
println(doubleNumber ?: "Нельзя удвоить 'ничего'")

// 1. Базовое преобразование (ОПАСНОЕ - кидает исключение)
val num1: Int = "123".toInt()

// 2. Безопасное преобразование (ПРАВИЛЬНЫЙ СПОСОБ)
val num2: Int? = "123".toIntOrNull() // Int? = 123
val num3: Int? = "hello".toIntOrNull() // Int? = null

// 3. Обработка результата безопасного преобразования

// Способ A: Проверка через if
if (num2 != null) {
    val result = num2 * 2 // Здесь компилятор знает, что num2 - это Int
}

// Способ B: Elvis-оператор (значение по умолчанию)
val validNumber: Int = num3 ?: 0 // Если num3 null, то вернётся 0
println(validNumber * 2) // Безопасная операция

// Способ C: Безопасный вызов (?.)
val length: Int? = num3?.toString()?.length // Если на любом этапе будет null, результат - null

Итог:
Int? — это тип "Int или null".

?. — безопасный вызов ("сделай это, если не null").

?: — Elvis-оператор ("если null, то используй это").

Вся эта система нуль-безопасности — главная фишка Kotlin, которая делает код стабильным и защищённым от частых ошибок.

Ты будешь часто видеть эти конструкции, они — основа идиоматичного Kotlin. Позже, в отдельном разделе курса, эта тема будет разбираться очень подробно.


*/