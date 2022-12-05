fun main() {
    val anggota: Array<String> = arrayOf("Haris", "Fulan", "Fulanta", "Fulantu")
    val umur = intArrayOf(18, 19, 20, 21)
    val acak = arrayOf("Haris", 18, 'H', 18.0)

    // operasi Array
    println("${anggota[0]} berumur ${umur[0]}") // tanda $ untuk memasukkan variable ke dalam string
                                                // [index] untuk mengakses index dalam array

    println(umur.size) // mendapat panjang Array

    anggota.set(0, "Sabil") // mengubah data di posisi index
    println(anggota[0])

    // Array null
    val arrayNull: Array<String?> = arrayOfNulls(3)
    arrayNull.set(0, "Haris")
    arrayNull.set(1, null)
    arrayNull.set(2, "Fulan")
    println(arrayNull[1])
}