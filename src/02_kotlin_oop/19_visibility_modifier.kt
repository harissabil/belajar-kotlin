open class Teacher(val name: String) { // secara default adalah public, bisa diakses dari manapun
    private fun teach() { // hanya bisa diakses di tempat deklarasinya
        println("Teach!")
    }
    open protected fun work() { // hanya bisa diakses di temapat deklarasi, dan juga turunannya
        println("Work!")
    }
    internal fun walk() { // hanya bisa diakses di module/project yang sama
        println("Walk!")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    override fun work() {
        super.work()
    }
}

fun main() {
    val teacher = Teacher("Haris")
    println(teacher.name)
    // teacher.teach() // tidak bisa diakses
    // teacher.work() // tidak bisa diakses
    teacher.walk()

    val superTeacher = SuperTeacher("Fulan")
    superTeacher.walk()
}
