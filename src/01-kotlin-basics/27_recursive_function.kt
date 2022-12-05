fun main() {
    println("Masukkan angka: ")
    val input = readln().toInt()
    val factorial = factorialRecursive(input)
    println("$input faktorialnya adalah $factorial")
}

// function yang memanggil function dirinya sendiri
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}