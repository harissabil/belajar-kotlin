class Account {
    val name: String by lazy { // salah satu implementasi delegating properties
        println("Lazy call")
        "Fulan" // properties baru diinisialisasi ketika properties tersebut diakses
    }
}

fun main() {
    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)
}