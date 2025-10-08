package stepik.basic_syntax

/* 2.9 Изменяемые переменные



В прошлом задании мы создавали калькулятор транспортного налога. На тот момент мы еще не умели пользоваться изменяемыми переменными var. Скорее всего для решения вам пришлось прибегать к дублированию кода - повторять в нескольких местах одни и те же строчки. Сейчас, познакомившись с var, сделайте рефакторинг вашего кода.

Задание точно такое же. Если даже просто копировать тот код без изменений, то задание будет пройдено. Но постарайтесь избавиться от дублирования, сократив код, сохраняя при этом работоспособность.

Задание:

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

Sample Input:

true
280

Sample Output:

Вид ТС: грузовой автомобиль
Мощность двигателя: 280 л.с.
Налоговая ставка: 85 руб./л.с.
Сумма налога: 23800 руб.







*/

fun main() {
    var taxRate: Int = 0
    var typeOfAuto: String
    var isAutoCargo: Boolean? = null
    var amountOfTax: Int

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

    amountOfTax = enginePower * taxRate

    println("Вид ТС: $typeOfAuto")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $taxRate руб./л.с.")
    println("Сумма налога: $amountOfTax руб.")
}






/*

fun main() {
    var temperature = readln().toInt()
    var airConditionIsOn = false


    if (temperature > 25) {
        airConditionIsOn = true
    } else if (temperature < 20) {
        airConditionIsOn = false
    }

    if (airConditionIsOn) {
        temperature -= 5
    } else {
        temperature += 5
    }

    // println("Air conditioner is on: $airConditionIsOn")
    println("Current temperature: $temperature")

    if (temperature > 25) {
        airConditionIsOn = true

    } else if (temperature < 20) {
        airConditionIsOn = false
    }

    if(airConditionIsOn) {
        temperature -= 5
    } else {
        temperature += 5
    }

    println("Now temperature is: $temperature")

}
*/

/*
fun main() {
    val temperature = readln().toInt()
    val hot: Boolean = temperature > 25
    val cold = temperature < 20

    if (hot) {
        println("The AC is on")
    } else if(cold) {
        println("The AC is off")
    } else {
        println("The AC is idle")
    }
}

*/

/*
fun main() {
    print("The weather is good today? false/true: ")
    val isGoodWeather = readln().toBoolean()
    print("What time is it now?: ")
    val timeNow = readln().toInt()
    val isDay = timeNow < 22 && timeNow > 5
    val isNight = timeNow >= 22 || timeNow <= 5
    if (isDay && isGoodWeather) {
        println("Go for walk!")
    } else if (isDay && !isGoodWeather) {
        println("Go to read book.")

    } else {
        println("Go to sleep!")
    }


}
*/


/*


*/