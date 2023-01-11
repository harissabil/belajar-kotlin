interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

// meneruskan properties atau function ke object yang lain
class MyBaseDelegate(val base: Base) : Base by base {
    override fun sayHello(name: String) { // override secara manual jika ingin mengubah isinya, jika tidak maka tidak usah ditulis karena sudah otomatis
        println("Hi $name")
    }
}

fun main() {
    val base = MyBase()
    base.sayHello("Haris")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Haris") // ini akan memanggil objek base sayHello-nya
    baseDelegate.sayGoodbye("Haris")
}