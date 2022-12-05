fun main() {
    val range = 1..100
    val rangeStep = 1..100 step 2
    val rangeUntil = 1 until 100
    val rangeDown = 100 downTo 0

    // operasi Range
    println(range.count()) // total data
    println(range.contains(10)) // cek ada atau tidak nilainya
    println(range.first) // nilai pertama
    println(range.last) // nilai terakhir
    println(rangeStep.step) // nilai kenaikan
}