fun main() {
    println("Masukkan tiga angka: ")

    var average = 0.0
    // mengiterasi apapun yang menyediakan ierator
    for (i in 1..3) {
        var input = readln().toInt()
        if (input != null) {
            average += input / 3.0
        }
    }
    println("Rata-rata dari nilai yang anda masukkan adalah $average")
}