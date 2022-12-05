fun main() {
    perkalian(3, 3)
}

// penulisan Unit tidak wajib karena jika kita membuat function tanpa nilai kembalian, sudah otomatis adalah Unit
fun perkalian(angka1: Int, angka2: Int): Unit {
    println(angka1 * angka2)
}