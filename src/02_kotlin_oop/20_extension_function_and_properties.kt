class Student(val name: String, val age: Int)

fun Student.sayHello(name: String) {
    println("Hello $name, my name is ${this.name} and my age is ${this.age}")
}

val Student.upperName: String
    get() = this.name.uppercase()

fun main() {
    val student = Student("Haris", 17)
    student.sayHello("Fulan")
    println(student.upperName)
}

