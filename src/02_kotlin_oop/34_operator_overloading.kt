data class Fruit(val quantity: Int) {
    operator fun plus(fruit: Fruit): Fruit { // kemampuan melakukan operasi apapun di object layaknya tipe data integer
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }
}

fun main() {
    val fruit1 = Fruit(200)
    val fruit2 = Fruit(150)
    val fruitTotal = fruit1 + fruit2
    println(fruitTotal)
    val fruitDifference = fruit1 - fruit2
    println(fruitDifference)
}