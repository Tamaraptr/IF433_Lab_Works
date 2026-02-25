package week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val ev = ElectricCar("Wuling", 4, 80)
    ev.accelerate()   // dari ElectricCar (final override)
    ev.honk()         // diwarisi dari Car
    ev.openTrunk()    // diwarisi dari Car
}