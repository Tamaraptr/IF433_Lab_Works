package week04

open class Vahicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        println("$brand melaju. Kecepatan: $speed km/jam");
    }

    open fun honk() {
        println("Beep beep!");
    }
}