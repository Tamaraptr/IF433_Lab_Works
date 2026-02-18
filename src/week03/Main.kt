package week03

fun main() {

    val player = Player("Tamara")

    println("Level awal: ${player.level}")

    // player.xp = 100  Ini harus error karena private

    println("\n--- Tambah 50 XP ---")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    println("\n--- Tambah 60 XP ---")
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}




