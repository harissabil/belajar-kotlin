fun main() {
    pangkat(2, 3)
}

// parameter -> data dari luar
// jika kita menambah parameter di function, maka ketika memanggil function tsb kita wajib memasukkan datanya
fun pangkat(satu: Int, dua: Int) {
    var result = 1
    for (i in 1..dua) {
        result *= satu
    }
    println("$satu pangkat $dua adalah $result")
}