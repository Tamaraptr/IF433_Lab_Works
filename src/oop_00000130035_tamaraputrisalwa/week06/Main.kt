package oop_00000130035_tamaraputrisalwa.week06

fun main() {

    // Membuat perangkat
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    // Membuat SmartHomeHub
    val hub = SmartHomeHub()

    // Menambahkan device ke hub
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Aktivasi Security Mode ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}