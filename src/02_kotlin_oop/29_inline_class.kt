// terlalu banyak class akan memakan konsumsi memory yang lebih banyak saat dijalankan
inline class Token(val value: String) { // hanya untuk class dengan satu property
    fun toUpper(): String = value.uppercase()
}

fun main() {
    val token = Token("Ini Token")
    println(token.value)
    println(token.toUpper())
}