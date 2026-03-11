package oop_00000130035_tamaraputrisalwa.week06

fun main() {

    val hub = SmartHomeHub()

    val lamp = SmartLamp("L01", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest")
    val cctv = SmartCCTV("C01", "CCTV Teras")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\nMematikan semua perangkat...")

    hub.turnOffAllSwitches()
}
