package stepik.basic_syntax

/* 2.7 Условный оператор

Напишите программу - калькулятор транспортного налога для легкового автомобиля:

Пользователь вводит мощность двигателя (л.с.)
Программа вычисляет налог, умножая кол-во л.с. введенное пользователем на соответствующую ставку
Программа выводит в консоль:

//Вид ТС: легковой автомобиль
//Мощность двигателя: _ л.с.
//Налоговая ставка: _ руб./л.с.
//Сумма налога: _ руб.

Действующие ставки:

<=100л.с. - 10 руб. / л.с
>100л.с. - 34 руб. / л.с
>150л.с. - 49 руб. / л.с
>200л.с. - 75 руб. / л.с
>250л.с. - 150 руб. / л.с
Sample Input:

280
Sample Output:

Вид ТС: легковой автомобиль
Мощность двигателя: 280 л.с.
Налоговая ставка: 150 руб./л.с.
Сумма налога: 42000 руб.


*/
fun main() {
    var amountOfTax: Int = 0
    var enginePower: Int = 0
    var taxRate: Int = 0

    //print("Введите мощность вашего автомобиля: ")
    enginePower = readln().toIntOrNull() ?: 0

    if (enginePower <= 100) {
        taxRate = 10
    } else if (enginePower > 100 && enginePower <= 150) {
        taxRate = 34
    } else if (enginePower > 150 && enginePower <= 200) {
        taxRate = 49
    } else if (enginePower > 200 && enginePower <= 250) {
        taxRate = 75
    } else if (enginePower > 250) {
        taxRate = 150
    }
    amountOfTax = enginePower * taxRate

    println("Вид ТС: легковой автомобиль")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $taxRate руб./л.с.")
    println("Сумма налога: ${amountOfTax} руб.")
}


/*
📑 Cheat Sheet по уроку 2.7




*/