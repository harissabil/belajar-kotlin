fun main() {
    // fitur untuk menyebut nama parameter saat memanggil
    identitas(asal = "Medan", umur = 18, nama = "Haris", pekerjaan = "Mahasiswa")
}

fun identitas(nama: String, umur: Int, asal: String, pekerjaan: String) {
    println("Nama: $nama\n" +
            "Umur: $umur\n" +
            "Asal: $asal\n" +
            "Pekerjaan: $pekerjaan")
}