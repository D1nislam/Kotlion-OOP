// Суперкласс Person с двумя свойствами: name и role
open class Person2(val name: String, val role: String) {
    open fun showInfo() {
        println("Name: $name, Role: $role")
    }
}

// Подкласс Moderator, переопределяющий метод showInfo()
class Moderator(name: String) : Person2(name, "Moderator") {
    override fun showInfo() {
        println("Moderator's Name: $name, Role: $role")
    }
}

// Подкласс Admin, переопределяющий метод showInfo()
class Admin(name: String) : Person2(name, "Admin") {
    override fun showInfo() {
        println("Admin's Name: $name, Role: $role")
    }
}

fun main() {
    print("Введите имя пользователя: ")
    val name = readLine() ?: return
    print("Введите роль пользователя (Moderator или Admin): ")
    val role = readLine() ?: return

    val user: Person2 = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> {
            println("Неизвестная роль")
            return
        }
    }

    user.showInfo()
}
