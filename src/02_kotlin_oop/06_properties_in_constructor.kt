class Hewan(val nama: String,
            val jenis: String,
            val habitat: String) // hanya bisa di primary constructor

fun main() {
    val bandeng = Hewan("Bandeng", "Herbivora", "Air laut")
    val ayam = Hewan("Ayam", "Omnivora", "Darat")

    println(bandeng.jenis)
    println(ayam.habitat)
}