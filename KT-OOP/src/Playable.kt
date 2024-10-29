// Интерфейс Playable с методом play()
interface Playable {
    fun play()
}

// Класс Guitar, реализующий интерфейс Playable
class Guitar : Playable {
    override fun play() {
        println("Играет гитара")
    }
}

fun main() {
    print("Введите команду: ")
    val command = readLine()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("Неизвестная команда")
    }
}
