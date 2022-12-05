fun kapital(nama: String): String = nama.uppercase()

fun main() {
    // membuat lambda
    val lambdaSatu: (String, String) -> String = {nama: String, panggilan: String ->
        val result = "Halo $nama, apa bisa saya memanggilmu $panggilan"
        result
    }

    // kalau hanya satu parameter bisa menggunakan it sebagai representasi dari parameter
    val lambdaDua: (String) -> String = {
        "Halo $it"
    }

    // Method References (membuat lambda dari function yang sudah ada)
    val lambdaTiga: (String) -> String = ::kapital

    // mengeksekusi lambda
    val nama = lambdaSatu("Haris", "Sabil")
    println(nama)
    val namaDua = lambdaDua("Haris")
    println(namaDua)
    val namaTiga = lambdaTiga("Haris")
    println(namaTiga)
}