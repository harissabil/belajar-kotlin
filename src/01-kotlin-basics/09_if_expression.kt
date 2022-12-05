fun main() {
    print("Masukkan nilai anda: ")
    val nilai = readln().toInt() // untuk menginput nilai dari user kemudian convert ke Integer
    val kkm = 70
    if (nilai > kkm) {
        println("Kamu lulus")
    } else if (nilai == kkm) {
        println("Giri giri safe")
    } else {
        println("Kamu harus remedial")
    }
}