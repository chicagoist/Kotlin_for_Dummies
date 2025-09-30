package stepik.basic_syntax

/* 2.8 Условный оператор. Часть 2. Комбинирование



Доработайте программу - калькулятор транспортного налога для использования как легкового так и грузового автомобиля:

    Пользователь вводит значение true или false - является ли транспортное средство грузовым. Значение true - соответствует грузовому автомобилю, а значение false - легковому.
    Пользователь вводит мощность двигателя (л.с.)
    Программа вычисляет налог, умножая кол-во л.с. введенное пользователем на соответствующую ставку. Обратите внимание - ставка для грузовых и легковых автомобилей разная.
    Программа выводит в консоль:

    Вид ТС: _ автомобиль

    Мощность двигателя: _ л.с.

    Налоговая ставка: _ руб./л.с.

    Сумма налога: _ руб.

Действующие ставки:

Легковые автомобили:

    <=100л.с. - 10 руб. / л.с
    >100л.с. - 34 руб. / л.с
    >150л.с. - 49 руб. / л.с
    >200л.с. - 75 руб. / л.с
    >250л.с. - 150 руб. / л.с

Грузовые автомобили:

    <=100л.с. - 25 руб. / л.с
    >100л.с. - 40 руб. / л.с
    >150л.с. - 50 руб. / л.с
    >200л.с. - 65 руб. / л.с
    >250л.с. - 85 руб. / л.с

Sample Input 1:

true
280

Sample Output 1:

Вид ТС: грузовой автомобиль
Мощность двигателя: 280 л.с.
Налоговая ставка: 85 руб./л.с.
Сумма налога: 23800 руб.

Sample Input 2:

false
250

Sample Output 2:

Вид ТС: легковой автомобиль
Мощность двигателя: 250 л.с.
Налоговая ставка: 75 руб./л.с.
Сумма налога: 18750 руб.






*/

fun main() {
    var taxRate: Int = 0
    var typeOfAuto: String
    var isAutoCargo: Boolean? = null
    print("Является ли Ваше транспортное средство грузовым? false/true: ")

    try {
        isAutoCargo = readln().toBooleanStrict()
    } catch (e: IllegalArgumentException) {
        println("Ошибка: Введите 'true' или 'false'")
        return
    }

    print("Введите мощность двигателя (в л.с.): ")
    val enginePower = readln().toIntOrNull() ?: run {
        println("Ошибка: требуется число!")
        return
    }

    if (!isAutoCargo) {
        typeOfAuto = "легковой автомобиль"
        taxRate = if (enginePower <= 100) {
            10
        } else if (enginePower <= 150) { // Уже выполнилось enginePower > 100
            34
        } else if (enginePower <= 200) { // Уже выполнилось enginePower > 150
            49
        } else if (enginePower <= 250) { // Уже выполнилось enginePower > 200
            75
        } else { // Все остальные случаи (enginePower > 250)
            150
        }
    } else {
        typeOfAuto = "грузовой автомобиль"
        taxRate = if (enginePower <= 100) {
            25
        } else if (enginePower <= 150) { // Уже выполнилось enginePower > 100
            40
        } else if (enginePower <= 200) { // Уже выполнилось enginePower > 150
            50
        } else if (enginePower <= 250) { // Уже выполнилось enginePower > 200
            65
        } else { // Все остальные случаи (enginePower > 250)
            85
        }
    }

    val amountOfTax = enginePower * taxRate

    println("Вид ТС: $typeOfAuto")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $taxRate руб./л.с.")
    println("Сумма налога: ${amountOfTax} руб.")
}


//fun main() {
//    print("The weather is good today? false/true: ")
//    val isGoodWeather = readln().toBoolean()
//    print("What time is it now?: ")
//    val timeNow = readln().toInt()
//    val isDay = timeNow < 22 && timeNow > 5
//    val isNight = timeNow >= 22 || timeNow <= 5
//    if (isDay && isGoodWeather) {
//        println("Go for walk!")
//    } else if (isDay && !isGoodWeather) {
//        println("Go to read book.")
//
//    } else {
//        println("Go to sleep!")
//    }
//
//
//}


//fun main() {
//    print("Введите сумму денег в кармане: ")
//    val haveMoney = readln().toIntOrNull() ?: 0
//    print("Ответьте - голодны ли Вы? true/false: ")
//    val haveHunger = readln().toBoolean()
//
//    if (haveHunger && haveMoney > 500) {
//        println("Кпите пиццу")
//    } else if (haveHunger && haveMoney < 500) {
//        println("Купите доширак")
//    } else if (!haveHunger && haveMoney > 500) {
//        println("Сходите в кино")
//    } else {
//        println("Сходите на прогулку")
//    }
//}

/*
📑 Cheat Sheet по уроку 2.8

ШПАРГАЛКА:

Обзор изученного материала (Урок 2.8: Условный оператор. Часть 2. Комбинирование)
Ты успешно применил комбинирование условий (&&, ||) и вложенные if-else if-else конструкции для создания более сложной логики. Также ты использовал toBoolean() / toBooleanStrict() и toIntOrNull() для обработки пользовательского ввода, что очень важно для Secure-first подхода.
Анализ твоего кода (Домашнее задание)
Твое решение для калькулятора транспортного налога в целом очень хорошее и демонстрирует понимание темы.
Положительные моменты:
Secure-first и Null-safety: Отлично, что ты используешь toIntOrNull() и try-catch для toBooleanStrict(). Это очень важно для обработки некорректного ввода и предотвращения падений программы.
Использование if-else if-else: Ты правильно построил логику для определения налоговой ставки в зависимости от мощности двигателя и типа автомобиля.
Четкий вывод: Формат вывода соответствует заданию.
val по умолчанию: Переменные taxRate и typeOfAuto объявлены как var, но в твоем коде они инициализируются один раз и затем не меняются. Это хороший кандидат для val.
Моменты для улучшения (в соответствии с принципами Modern Kotlin, Null-safety, Secure-first):
isAutoCargo: Boolean? = null: Использование Boolean? (nullable Boolean) здесь не совсем идиоматично, так как ты сразу же обрабатываешь ошибку ввода и выходишь из программы, если ввод некорректен. Если ввод корректен, isAutoCargo всегда будет true или false. Можно избежать nullable типа.
try-catch для toBooleanStrict(): Хотя try-catch работает, в Kotlin есть более идиоматичные способы обработки ошибок ввода для булевых значений, если мы хотим быть Secure-first и не использовать nullable. toBooleanStrictOrNull() был бы более подходящим.
taxRate и typeOfAuto как var: Как упомянуто выше, эти переменные можно объявить как val, используя if как выражение. Это соответствует принципу Иммутабельность по умолчанию: val вместо var.
Повторяющаяся логика if-else if-else: Хотя она и правильна, есть небольшое дублирование логики определения ставки для легковых и грузовых автомобилей. Это можно немного оптимизировать, но на текущем этапе курса это не критично.
Мини-шпаргалка по уроку 2.8
Комбинирование условий:
&& (логическое И): оба условия должны быть true.
|| (логическое ИЛИ): хотя бы одно условие должно быть true.
! (логическое НЕ): инвертирует булево значение.
if как выражение: В Kotlin if может возвращать значение, что позволяет присваивать результат if-else блоку в val. Это способствует Иммутабельности по умолчанию.
code
Kotlin
val result = if (condition) {
    "Value if true"
} else {
    "Value if false"
}
Null-safety и Secure-first:
Всегда используй toIntOrNull(), readlnOrNull(), toBooleanStrictOrNull() для пользовательского ввода.
Немедленно обрабатывай null или некорректные значения (например, с помощью ?: return или if (value == null) return).
Избегай !! (оператор "not-null assertion"), если нет 100% уверенности, что значение не null.

*/