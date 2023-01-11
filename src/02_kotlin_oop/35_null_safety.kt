data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}") // tidak perlu safe call (?) karena sudah dilakukan pengecekan
    }
}

fun hello(friend: Friend?) {
    val name = friend?.name ?: "" // elvis operator, kalau null akan diganti
    println("Hello $name")
}

fun helloNull(friend: Friend?) {
    val name = friend!!.name // mengkonversi data yang nullable menjadi tidak nullable
    println("Hello $name")   // tidak disarankan kecuali benar-benar yakin variable tersebut tidak null
}

fun main() {
    sayHello(Friend("Fulan"))
    hello(null)
    helloNull(null) // ERROR
}