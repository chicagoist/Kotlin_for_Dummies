package stepik.basic_syntax

/* 2.7 Условный оператор


*/
fun main() {

    print("Entry age firsts person: ")
    val ageFirstPerson = readln().toIntOrNull() ?: 0
    print("Entry age seconds person: ")
    val ageSecondPerson = readln().toIntOrNull() ?: 0

    if (ageFirstPerson == ageSecondPerson) {
        println("Они одногодки")
    } else if (ageFirstPerson > ageSecondPerson) {
        println("Первый человек старше второго на ${ageFirstPerson - ageSecondPerson} лет")
    } else {
        println("Второй человек старше первого на ${ageSecondPerson - ageFirstPerson} лет")
    }

}


/*
📑 Cheat Sheet по уроку 2.7




*/