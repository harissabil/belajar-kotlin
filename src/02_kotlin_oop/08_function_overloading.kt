class Menyapa(val name: String) {

    fun sayHello(firstNameParam: String) {
        println("Hello $firstNameParam, my name is $name")
    }

    // membuat function dengan nama yang sama
    // parameternya wajib berbeda (tipenya atau jumlah)
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, my name is $name")
    }

}

fun main() {
    val haris = Menyapa("Haris")
    haris.sayHello("Fulan")
    haris.sayHello("Fulan", "Ahmad")
}