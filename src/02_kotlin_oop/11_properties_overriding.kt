open class Shape() {
    open val corner: Int = -1

    open fun printName() {
        println("This is shape")
    }
}

class Rectangle() : Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner // untuk mengakses properties atau function milik parent class

    override fun printName() {
        println("This is rectangle")
        super.printName() // untuk mengakses properties atau function milik parent class
    }
}

class Triangle() : Shape() {
    override val corner: Int = 3
}

fun main() {
    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Rectangle()
    println(shape2.corner)
    println(shape2.parentCorner)
    shape2.printName()

    val shape3 = Triangle()
    println(shape3.corner)
}