fun main() {
    println(kuadrat(3))
    halo("Haris")
}

//deklarasi function hanya dengan satu baris kode untuk function yang sangat simple
fun kuadrat(a: Int): Int = a * a

fun halo(nama: String): Unit = println("Halo $nama")