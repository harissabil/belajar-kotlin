class Handphone(namaParam: String, merkParam: String, tahunParam: Int = 2022) {

    init {
        println("Handphone $merkParam dibuat") // setiap objek Handphone dibuat, kode init ini dieksekusi
    }

    var nama: String = namaParam
    var merk: String = merkParam
    var tahun: Int = tahunParam

    fun rilis() {
        println("$merk $nama rilis tahun $tahun")
    }
}

fun main() {
    val nova5t = Handphone("nova 5T", "HUAWEI", 2019)
    nova5t.rilis()

    val a52 = Handphone("A52", "Samsung")
    a52.rilis()
}
