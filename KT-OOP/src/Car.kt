// Класс Car с двумя свойствами: brand и year
class Car(private val brand: String, private val year: Int) {
    fun printDetails() {
        println("Brand: $brand, Year: $year")
    }
}

fun main() {
    print("Введите количество автомобилей: ")
    val n = readLine()?.toIntOrNull() ?: return
    val cars = mutableListOf<Car>()

    for (i in 1..n) {
        print("Введите марку автомобиля и год выпуска через пробел: ")
        val input = readLine()?.split(" ") ?: continue
        if (input.size == 2) {
            val brand = input[0]
            val year = input[1].toIntOrNull()
            if (year != null) {
                val car = Car(brand, year)
                cars.add(car)
            } else {
                println("Некорректный ввод года")
            }
        } else {
            println("Некорректный ввод данных")
        }
    }

    for (car in cars) {
        car.printDetails()
    }
}
