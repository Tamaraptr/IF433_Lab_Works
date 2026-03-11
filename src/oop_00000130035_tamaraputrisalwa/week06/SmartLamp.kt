package oop_00000130035_tamaraputrisalwa.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Lampu sekarang menyala.")
    }

    override fun turnOff() {
        println("$name dimatikan. Lampu sekarang mati.")
    }
}