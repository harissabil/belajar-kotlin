fun main() {
    // membatasi sebuah function agar hanya bisa diakses pada function tertentu
    fun sayHello(nama: String): String = "Hello $nama"

    val tes = sayHello("Haris")
    println(tes)
}