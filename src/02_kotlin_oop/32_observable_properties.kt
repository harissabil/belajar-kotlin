import kotlin.properties.Delegates

class Akun(deskripsi: String = "") {
    var deskripsi: String by Delegates.observable(deskripsi) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}

fun main() {
    val akun = Akun()
    akun.deskripsi = "Nama"
    akun.deskripsi = "Fulan"
    akun.deskripsi = "Haris"
}