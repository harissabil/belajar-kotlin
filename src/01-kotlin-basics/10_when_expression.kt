fun main() {
    print("Masukkan nilai anda: ")
    val nilai = readln().toInt() // untuk menginput nilai dari user kemudian convert ke Integer

    when (nilai) {
        in 70 .. 100 -> println("Kamu lulus") // in untuk nilai yang berada dalam range
        in 0 .. 69 -> println("Kamu harus remedial") // in untuk nilai yang berada dalam range
        else -> println("Masukkan nilai dengan benar")
    }
}