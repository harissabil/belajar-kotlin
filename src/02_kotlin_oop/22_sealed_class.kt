sealed class Operation(val name: String) // merupakan abstract class, didesain untuk inheritance dan cocok digunakan sebagai parent class
class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Moodulo")

fun operation(value1: Int, value2: Int, operation: Operation): Int { // sangat berguna saat menggunakan when expression
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(5, 5, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))
}