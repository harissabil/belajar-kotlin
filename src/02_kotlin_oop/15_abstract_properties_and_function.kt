abstract class Animal {
    abstract val name: String // inisialisasi data dilakukan di kelas turunannya
    abstract fun run() // definisikan fungsinya di kelas turunannya
}

class Pet(override val name: String) : Animal() {
    override fun run() {
        println("$name run")
    }
}

fun main() {
    val cat = Pet("Cat")
    cat.run()

    val dog = Pet("Dog")
    dog.run()
}