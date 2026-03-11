package oop_00000130035_tamaraputrisalwa.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name dinyalakan. Kamera CCTV aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("$name mulai merekam area sekitar.")
    }
}