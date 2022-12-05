fun main() {

    val a = 1
    val b = 2
    val c = 3
    val d = 4

    // konjungsi (dan)
    val result = (a < b) && (c < d) // true jika semua ekspresi boolean true
    println(result)

    // disjungsi (atau)
    val result2 = (a < b) || (c > d) // true jika semua atau ada salah satu ekspresi yang true
    println(result2)
}