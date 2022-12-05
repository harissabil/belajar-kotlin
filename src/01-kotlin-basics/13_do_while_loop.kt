fun main() {
    println("Mari berhitung sampai nol dari angka yang kamu input: ")
    var input = readln().toInt()
    // blok kode akan dijalankan terlebih dahulu kemudian di akhir dilakukan pengecekan
    do {
        println(input)
        input--
    } while (input > -1)
}