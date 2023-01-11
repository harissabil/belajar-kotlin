open class Employee(val name: String) {
    open fun sayHello(name: String) { // function overriding
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) { // otomatis open ngikut parentnya, tambahkan final jika tidak ingin di override pada childnya
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
    // tidak bisa override karena function di parentnya sudah final
//    override fun sayHello(name: String) { // hanya isinya yang boleh diubah
//        println("Hello $name, my name is Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) { // hanya isinya yang boleh diubah
        println("Hello $name, my name is Vice President ${this.name}")
    }
}

fun main() {
    val manager = Manager("Haris")
    manager.sayHello("Fulan")

    val vicePresident = VicePresident("Fulan")
    vicePresident.sayHello("Haris")
}