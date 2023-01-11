data class Game(val name: String, val price: Int)

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

data class Login(val username: String, val password: String)

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Zelda", 500000)
    // val name = game.name
    // val price = game.price
    val (name, price) = game // membuat multiple variables dari sebuah object
    println(name)            // tidak bisa dilakukan untuk semua objek, hanya objek yang memiliki function componentX() yang bisa dilakukan destructing
    println(price)           // data class akan otomatis membuat function componentX() sesuai jumlah parameternya

    val result = minmax(10, 100)
    // val min = result.min
    // val max = result.max
    val (min, max) = result // destruction di function
    println(min)
    println(max)

    val login = Login("haris", "himitsu")
//    println(login(login) { login ->
//        login.username == "haris" && login.password == "himitsu"
//    })
    println(login(login) { (username, password) -> // destructing lambda parameter
        username == "haris" && password == "himitsu"
    })
}