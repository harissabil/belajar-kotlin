class Hape(namaParam: String, merkParam: String, tahunParam: Int = 2022) {
    var nama: String = namaParam
    var merk: String = merkParam
    var tahun: Int = tahunParam

    fun rilis() {
        println("$merk $nama rilis tahun $tahun")
    }
}

fun main() {
    val nova5t = Hape("nova 5T", "HUAWEI", 2019)
    val a52 = Hape("A52", "Samsung")

    nova5t.rilis()
    a52.rilis()
}
