// Суперкласс Animal с методом sound()
open class Animal {
    open fun sound() {
        println("Some generic animal sound")
    }
}

// Подкласс Dog, переопределяющий метод sound()
class Dog : Animal() {
    override fun sound() {
        println("Woof Woof")
    }
}

// Подкласс Cat, переопределяющий метод sound()
class Cat : Animal() {
    override fun sound() {
        println("Meow Meow")
    }
}

// Подкласс Bird, переопределяющий метод sound()
class Bird : Animal() {
    override fun sound() {
        println("Tweet Tweet")
    }
}

fun main() {
    print("Введите название животного (Dog, Cat или Bird): ")
    val animalType = readLine()

    val animal: Animal = when (animalType) {
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else -> {
            println("Неизвестное животное")
            return
        }
    }

    animal.sound()
}
