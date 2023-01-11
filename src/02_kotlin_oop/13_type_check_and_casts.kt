class Laptop(val name: String)

class HandPhone(val name: String)

fun printObject(any: Any) {
    if (any is Laptop) { // kalau true, otomatis berubah menjadi tipe data yang kita cek
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("Haris")
    // printString(1) // ERROR

    printStringSafe("Haris")
    printStringSafe(1) // null

    printObject(Laptop("Acer"))
    printObject(HandPhone("Huawei"))
    printObject("Haris")

    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Huawei"))
    printObjectWithWhen("Haris")
}

