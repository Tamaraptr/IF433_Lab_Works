package week04

fun main() {

    println("--- Testing Manager ---")
    val manager = Manager(
        name = "Budi",
        baseSalary = 10_000_000
    )
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(
        name = "Siti",
        baseSalary = 8_000_000,
        programmingLanguage = "Kotlin"
    )
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}