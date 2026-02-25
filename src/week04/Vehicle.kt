package week04

open class Vehicle(val brand: String) {

    open fun accelerate() {
        println("Kendaraan $brand sedang menambah kecepatan.")
    }

    open fun honk() {
        println("Klakson kendaraan berbunyi!")
    }
}
