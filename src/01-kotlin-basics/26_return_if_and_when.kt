fun main() {
    // mengembalikan nilai dalam if
    fun halo(nama: String = ""): String {
        return if (nama == "") {
            "Halo gan"
        } else {
            "Halo $nama"
        }
    }

    // mengembalikan nilai dalam when
    fun halo2(nama: String = ""): String {
        return when (nama) {
            "" -> "Halo gan"
            else -> "Halo $nama"
        }
    }

    val tes = halo("")
    println(tes)
    val tes2 = halo2("Haris")
    println(tes2)
}