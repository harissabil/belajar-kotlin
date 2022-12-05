/*
Dengan inline maka higher order function akan diduplicate agar aplikasi tidak membuat objek lambda berulang
Sehingga tidak memperlambat performa aplikasi
 */
inline fun halo(namaDepan: () -> String,
                noinline namaBelakang: () -> String): String { // jika parameter ingin dibikin objek terus
    return "Halo ${namaDepan()} ${namaBelakang()}"
}

fun main() {
    println(halo({ "Haris" }, { "Sabil" }))
}