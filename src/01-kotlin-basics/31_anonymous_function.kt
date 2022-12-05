fun main() {
    println("Masukkan nama kamu: ")
    val input = readln()

    fun halo(value: String, transformer: (String) -> String): String {
        return transformer(value)
    }

    // Anonymous Function (gantinya lambda yang tidak support return)
    val anonUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Jangan kosong"
        }
        return "Halo ${value.uppercase()}"
    }

    val result = halo(input, anonUpper)
    println(result)
}