package week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()     // memanggil method milik Car
    myCar.honk()          // memanggil method hasil override
    myCar.accelerate()    // memanggil gabungan Parent + Child
    val ev = ElectricCar("Wuling", 4, 80)
    ev.accelerate()
}