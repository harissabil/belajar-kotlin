data class Product(
    val name: String,
    val price: Int,
    val category: String
)

fun main() {
    val product = Product("Indomie", 3500, "Food")
    val product2 = product.copy(name = "Mie Sedap")

    println(product)
    println(product2)
}