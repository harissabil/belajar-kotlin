import java.lang.NullPointerException

class ValidationException(message: String) : Throwable(message) // semua tipe data error turunan dari Throwable

fun sayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank") // untuk membuat error gunakan keyword throw diikuti dengan object errornya
    }
    println("Hello $name")
}

fun main() {
    // try catch digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka
    // akan ditangkap dan kita akan memberikan reaksi sesuai yang kita inginkan
    // karena jika tidak ada, maka program otomatis berhenti ketika terjadi exception
    try {
        sayHello("Haris")
        sayHello("")
    } catch (error: ValidationException) { // jika ingin menangkap semua jenis error gunakan Throwable
        println("Error with message: ${error.message}")
    } catch (error: NullPointerException) {
        println("Error with message: ${error.message}")
    } finally { // bisa ditambahkan di try catch, akan selalu dieksekusi setelah try catch baik sukses ataupun gagal
        println("Finally will always be executed") // cocok untuk menempatkan kode yang memang harus dilakukan
    }

}