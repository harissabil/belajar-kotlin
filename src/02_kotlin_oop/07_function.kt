class Sapa(val nama: String) {

    fun salam(agama: String) {
        if (agama == "Islam" || agama == "islam") {
            println("Assalamualaikum $nama")
        } else {
            println("Halo $nama")
        }
    }

}

fun main() {
    println("Masukkan nama anda:")
    val inputNama = Sapa(readln())
    println("Sebutkan agama anda:")
    val inputAgama = readln()
    inputNama.salam(inputAgama)
}