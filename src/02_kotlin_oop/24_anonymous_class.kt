interface Action {
    fun action()
}

fun fireAction(action: Action) {
    action.action()
}

// kemampuan membuat objek dari class yang bahkan belum lengkap
fun main() {
    fireAction(object : Action { // gunakan kata kunci object diikuti dengan deklarasi class child seperti pada pewarisan
        override fun action() = println("Action one")
    })

    fireAction(object : Action {
        override fun action() = println("Action two")
    })
}