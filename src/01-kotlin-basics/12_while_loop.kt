fun main() {
    println("Masukkan angka pertama: ")
    val input1 = readln().toInt()
    println("Masukkan angka kedua: ")
    val input2 = readln().toInt()

    var result = 1
    var i = 0
    // blok while akan terus berulang sampai kondisinya bernilai false
    while (input1 != null && input2 != null && i < input2) {
        result *= input1
        i++
    }
    println("$input1 pangkat $input2 hasilnya $result")
}