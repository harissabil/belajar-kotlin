fun main() {
    val result = pembagian(4, 2)
    println(result)
    val result2 = pembagian(4, 0)
    println(result2)
}

// mengembalikan data dengan tipe String
fun pembagian(a: Int, b: Int): String {
    if (b == 0) {
        return "Tidak bisa dibagi 0"
    } else {
        return "${a / b}"
    }
}