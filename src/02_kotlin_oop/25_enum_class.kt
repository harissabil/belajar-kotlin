enum class Gender(val description: String) { // class yang sudah tetap nilainya
    MALE("Male"), // jika properties diset menggunakan constructor, maka saat pembuatan objek enum wajib diisi
    FEMALE("Female");

    fun printDescription() { // jika terdapat abstract function, wajib di override pada saat pembuatan objek enum
        println(description)
    }
}

fun main() {
    val man = Gender.MALE // tidak bisa membuat objek, namun bisa mendeklarasikan secara langsung
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(allGenders.toList())

    man.printDescription()
    woman.printDescription()
}