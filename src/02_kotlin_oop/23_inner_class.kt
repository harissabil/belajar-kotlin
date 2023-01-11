class Boss(val name: String) { // outer class

    inner class Employee(val name: String) { // tambahkan inner agar bisa mengakses data outer class

        fun hi() {
            println("Hi, my name is $name, my boss is ${this@Boss.name}")
        }

    }

}

fun main() {
    val boss1 = Boss("Haris")
    val employee1 = boss1.Employee("Budi")
    val employee2 = boss1.Employee("Joko")

    val boss2 = Boss("Sabil")
    val employee3 = boss2.Employee("Andi")
    val employee4 = boss2.Employee("Rudi")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}