package oop_00000130035_tamaraputrisalwa.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    init {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun showTime() {
        println("Menampilkan waktu digital di layar smartwatch")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}