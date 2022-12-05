fun main() {
    for (i in 0..10) {
        if (i == 5) {
            break // apabila if expression true, break akan dijalankan yang mana menghentikan for loop
        }
        print(i)
    }

    println() // sebagai pemisah

    for (j in 0..10) {
        if (j == 5) {
            continue // apabila if expression true, continue akan dijalankan yang mana akan melompati iterasi saat ini
        }
        print(j)
    }
}