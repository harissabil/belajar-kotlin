class Name(paramFirst: String, paramMiddle: String, paramLast: String) {

    init {
        println("$paramFirst dipanggil")
    }

    // wajib memanggil primary constructor jika ada
    constructor(paramFirst: String, paramLast: String) : this(paramFirst, "", paramLast) {
        println("Secondary Constructor 1")
    }

    // memanggil secondary constructor sebelumnya
    constructor(paramFirst: String) : this(paramFirst, "") {
        println("Secondary Constructor 2")
    }

    val firstName: String = paramFirst
    val middleName: String = paramMiddle
    val lastName: String = paramLast

}

fun main() {
    val fulan = Name("Fulan", "Ahmad", "Nasution")
    val fulanah = Name("Fulanah", "Siti")
    val zidan = Name("Zidan")

    println(fulan.middleName)
    println(fulanah.lastName)
    println(zidan.firstName)
}