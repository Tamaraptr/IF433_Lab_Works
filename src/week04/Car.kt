package week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun accelerate() {
        super.accelerate()  // panggil versi Vehicle
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}