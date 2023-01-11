class Murid(val nama: String) {
    fun sayHello(nama: String) {
        println("Halo $nama, namaku ${this.nama}")
    }
}

typealias Pelajar = Murid // biasanya ketika ada tipe data dengan nama yang sama dari package lain atau untuk mempersingkat

fun main() {
    val haris = Pelajar("Haris")
    haris.sayHello("Fulan")
    perkenalan { "Haris" }
}

typealias namaku = () -> String // untuk function

fun perkenalan(nama: namaku) {
    println("Halo namaku $nama")
}