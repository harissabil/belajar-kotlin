class Television {
    lateinit var brand: String // hanya bisa di var karena akan di inisialisasi nanti

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}

fun main() {
    val television = Television()
    // television.brand = "Sony" // boleh langsung set valuenya tanpa harus memanggil fungsi
    television.initTelevision("Sony")
    println(television.brand)
}