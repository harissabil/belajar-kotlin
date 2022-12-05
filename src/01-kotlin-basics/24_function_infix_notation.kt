fun main() {
    val tes = "Haris" to "UP"
    println(tes)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}