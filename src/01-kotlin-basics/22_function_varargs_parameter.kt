fun main() {
    val barangFulan = total("Fulan", 5, 6, 7, 8, 9, 10)
    println(barangFulan)
}

// vararg hanya bisa digunakan oleh parameter terakhir
fun total(nama: String, vararg barang: Int): String {
    var result = 0
    for (item in barang) {
        result += item
    }
    return "$nama mempunyai $result barang"
}