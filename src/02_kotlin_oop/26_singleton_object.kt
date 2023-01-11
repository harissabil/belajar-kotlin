object Utilities { // objek yang hanya dibuat satu kali, tidak memiliki constructors
    val name: String = "My Utilities"
    fun toUpper(value: String): String = value.uppercase()
}

class Application(val name: String) {
    object Utilities { // inner Object
        fun hello(name: String) {
            println("Hello $name")
        }
    }
}

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Haris"))

    Application.Utilities.hello("Haris")
}