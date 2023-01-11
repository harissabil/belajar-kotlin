class Person {
    var firsName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}

fun main() {
    val haris = Person()
    haris.firsName = "Haris"

    val fulan = Person()
    fulan.firsName = "Fulan"

    val serenoa = Person()
    serenoa.firsName = "Serenoa"

    println(haris.firsName)
    println(fulan.firsName)
    println(serenoa.firsName)
}