class Applications(val name: String) {
    // kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama objek
    companion object { // cocok untuk yang ingin membuat singleton objek yang namanya sama dengan nama sebuah class
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }
}

fun main() {
    println(Applications.Companion.toUpper("Haris")) // bisa diakses dengan Companion, atau
    println(Applications.toUpper("Haris")) // langsung lewat nama classnya
}