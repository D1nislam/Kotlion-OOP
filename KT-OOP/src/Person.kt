class Person {
    private var name: String? = null

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Name: $name")
    }
}

fun main() {
    print("Введите количество людей: ")
    val n = readLine()?.toIntOrNull() ?: return
    val people = mutableListOf<Person>()

    for (i in 1..n) {
        print("Введите имя: ")
        val name = readLine() ?: continue
        val person = Person()
        person.setName(name)
        people.add(person)
    }

    for (person in people) {
        person.printName()
    }
}
