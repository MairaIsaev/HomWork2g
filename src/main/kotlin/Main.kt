import Cars.Car
import Cars.Car2

fun main(args: Array<String>) {
    val carsList = listOf(

        Car("BMW", "e34", "530i"),
        Car("Ford", "Mustang", "v8"),
        Car("Mercedes", "Benz-CLS", "C257")
    )
    val Car2 = Car2()

    carsList.forEachIndexed() { index, car -> println("$index: ${car.brand}") }
    println("Напишите номер машины, о котором хотите узнать: ")
    val userInput = readLine()

    userInput?.toIntOrNull()?.let { index ->
        if (index in carsList.indices) {
            val selectedCar = carsList[index]
            Car2.printCarInfo(selectedCar)


        } else {
            println("Неверный номер элемента")
        }
    }?: println("Некорректный ввод")
}