class Siswa(val nama: String) {

    fun sayHello(nama: String) {
        println("Halo $nama, namaku ${this.nama}") // mengakses properties yang tertutup oleh parameter dengan nama yang sama
        // direkomendasikan tetap menggunakan kata kunci this untuk mengakses properties yang punya objek
    }

}

fun main() {
    val haris = Siswa("Haris")
    haris.sayHello("Fulan")
}