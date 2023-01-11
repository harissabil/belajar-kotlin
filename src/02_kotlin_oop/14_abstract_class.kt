abstract class Location(val name: String) // class tidak bisa dibuat menjadi objek, hanya bisa diturunkan

class Country(name: String) : Location(name)

class City(name: String) : Location(name)

fun main() {
//    val location = Location("Indonesia") // ERROR
    val country = Country("Indonesia")
    val city = City("Medan")

    println(country.name)
    println(city.name)
}