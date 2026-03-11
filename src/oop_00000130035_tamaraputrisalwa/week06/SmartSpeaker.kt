package oop_00000130035_tamaraputrisalwa.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Smart speaker siap digunakan.")
    }

    override fun turnOff() {
        println("$name dimatikan. Smart speaker berhenti bekerja.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}