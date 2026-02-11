package week02

import java.util.Scanner
import kotlin.random.Random

class Student(
    val name: String,
    val nim: String,
    val gpa: Double = 0.0,
    val major: String
) {
    constructor(name: String, nim: String)
            : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else 0
    }
}

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(): Int {
        println("$name menyerang musuh dengan damage $baseDamage!")
        return baseDamage
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
        println("$name menerima $damage damage. HP sekarang: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {

    val scanner = Scanner(System.`in`)

    println("===== SUPER PROGRAM WEEK 02 =====")
    println("1. Pendaftaran Mahasiswa")
    println("2. Library Loan System")
    println("3. Mini RPG Battle")
    print("Pilih Menu (1/2/3): ")

    val menu = scanner.nextInt()
    scanner.nextLine()

    when (menu) {

        3 -> {
            println("\n=== MINI RPG BATTLE ===")

            print("Masukkan Nama Hero: ")
            val heroName = scanner.nextLine()

            print("Masukkan Base Damage: ")
            val baseDamage = scanner.nextInt()
            scanner.nextLine()

            val hero = Hero(heroName, baseDamage)
            var enemyHp = 100

            println("\nBattle dimulai! HP Hero: ${hero.hp}, HP Musuh: $enemyHp")

            while (hero.isAlive() && enemyHp > 0) {

                println("\nMenu:")
                println("1. Serang")
                println("2. Kabur")
                print("Pilih aksi: ")

                val choice = scanner.nextInt()
                scanner.nextLine()

                if (choice == 1) {

                    enemyHp -= hero.attack()
                    if (enemyHp < 0) enemyHp = 0

                    println("HP Musuh sekarang: $enemyHp")

                    if (enemyHp > 0) {
                        val enemyDamage = Random.nextInt(10, 21)
                        println("Musuh menyerang balik!")
                        hero.takeDamage(enemyDamage)
                    }

                } else if (choice == 2) {
                    println("${hero.name} kabur dari pertarungan!")
                    break
                } else {
                    println("Pilihan tidak valid!")
                }
            }

            println("\n=== HASIL PERTARUNGAN ===")
            println("HP Hero : ${hero.hp}")
            println("HP Musuh: $enemyHp")

            if (hero.hp > 0 && enemyHp == 0) {
                println("${hero.name} MENANG!")
            } else if (hero.hp == 0) {
                println("${hero.name} KALAH!")
            } else {
                println("Pertarungan berakhir tanpa pemenang.")
            }
        }

        else -> println("Untuk fokus, jalankan menu 3 (Mini RPG) dulu.")
    }
}


