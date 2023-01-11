interface Interaction { // hanya bisa diturunkan
    val name: String
    fun sayHello(name: String) { // function tidak harus abstract
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction { // bisa melakukan inheritance dengan interface lain, namun tidak bisa dengan class
    fun go() {
        println("GO ${this.name.uppercase()}!")
    }
}

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(override val name: String) : Interaction, Go, MoveA, MoveB { // multiple inheritance, namun super class hanya bisa satu
    override fun move() {
        super<MoveA>.move() // jika ada nama fungsi yang identik
        super<MoveB>.move()
        println("Move human")
    }
}

fun main() {
    val human = Human("Haris")
    human.sayHello("Fulan")
    human.go()
    human.move()
}