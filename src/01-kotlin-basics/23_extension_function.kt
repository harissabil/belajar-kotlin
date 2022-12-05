fun main() {
    val tes = 10.kaliDua()
    println(tes)
}

// menambahkan tipe data pada nama function
fun Int.kaliDua(): Int {
    return this * 2 // untuk mengakses menggunakan keyword this
}