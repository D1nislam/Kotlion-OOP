open class Person_1 {
    private var name: String? = null

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Name: $name")
    }
}

class Student : Person_1() {
    private var studentId: Int? = null

    fun setStudentId(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        printName()  // Используем метод из класса Person
        println("Student ID: $studentId")
    }
}

fun main() {
    print("Введите количество студентов: ")
    val n = readLine()?.toIntOrNull() ?: return
    val students = mutableListOf<Student>()

    for (i in 1..n) {
        print("Введите имя и идентификатор студента через пробел: ")
        val input = readLine()?.split(" ")
        if (input != null && input.size == 2) {
            val name = input[0]
            val id = input[1].toIntOrNull()
            if (id != null) {
                val student = Student()
                student.setName(name)
                student.setStudentId(id)
                students.add(student)
            }
        }
    }

    for (student in students) {
        student.printStudentDetails()
    }
}
