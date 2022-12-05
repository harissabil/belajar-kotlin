fun main() {
    sapa()
}

// kita masukkan nilai default sehingga kita tidak perlu memasukkan datanya
fun sapa(panggilan: String = "gan") {
    println("Halo $panggilan, salam kenal ya")
}