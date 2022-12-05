fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI // saat i > 5 akan langsung berhenti
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI // saat j == 5 akan langsung continue ke loopI, coba bandingkan tanpa label
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main() {

    fun tes(nama: String, operasi: (String) -> Unit): Unit = operasi(nama)

    tes("") test@{
        if (it == "") {
            return@test
        } else {
            println("Haris")
        }
    }

    labelBreak()
    labelContinue()

}