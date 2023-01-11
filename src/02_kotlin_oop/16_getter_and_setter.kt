class Note(title: String) {

    var title: String = title
        get() {
            println("Call getter function") // untuk melihat apakah fungsi terpanggil
            return field // mengacu ke title
        }
        set(value) {
            println("Call setter function") // untuk melihat apakah fungsi terpanggil
            if (value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase()
}

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.bigTitle)
}