package week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("ERROR: Damage tidak boleh negatif! Nilai tidak berubah.")
                }

                value > 1000 -> {
                    println("WARNING: Damage terlalu besar! Dipaksa jadi 1000.")
                    field = 1000
                }

                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
