// membuat lambda menjadi parameter di sebuah function
fun halo(value: String, transformer: (String) -> String): String {
    return "Halo ${transformer(value)}"
}

fun main() {
    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }
    println(halo("Haris", upperTransformer))
    println(halo("Haris", lowerTransformer))

    // Trailing Lambda (opsional, supaya lebih enak dibaca)
    val result = halo("Haris") { value: String ->
        value.uppercase() }
    println(result)
}