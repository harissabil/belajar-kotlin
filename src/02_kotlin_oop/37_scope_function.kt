// function yang bisa digunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda function
// bebas mau pakai yang mana sesuai kemauan kita
// penggunaannya agar lebih mudah terbaca, misal ingin memanipulasi sebuah objek, lebih baik di-wrap dalam scope function
fun main() {
    val student = Student("Haris", 15)
    val result: String = student.let {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result)

    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result5)
}