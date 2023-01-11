/*
class Mobil, berisi semua properties (fields atau attributes) dan functions (method atau behaviour)
yang dimiliki object
*/
class Mobil(namaParam: String, // constructor, parameter nama
            brandParam: String, // constructor, parameter brand
            hargaParam: Int // constructor, parameter harga
) {
    var nama: String = namaParam // properti nama
    var brand: String = brandParam // properti brand
    var harga: Int = hargaParam // properti harga

    // function jalan
    fun jalan() {
        println("$brand $nama dengan harga $harga berjalan")
    }

    // function berhenti
    fun berhenti() {
        println("$brand $nama dengan harga $harga berhenti")
    }
}

fun main() {
    val avanza = Mobil("Avanza", "Toyota", 200000) // object dari class
    println("Nama: ${avanza.nama}\nBrand: ${avanza.brand}\nHarga: ${avanza.harga}")
    avanza.jalan()
    avanza.berhenti()
}