package stepik.basic_syntax

/* 2.9 Изменяемые переменные





*/


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