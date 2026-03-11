package oop_00000130035_tamaraputrisalwa.week06

fun main() {

    val hub = SmartHomeHub()

    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\nMengaktifkan Security Mode...")
    hub.activateSecurityMode()
}