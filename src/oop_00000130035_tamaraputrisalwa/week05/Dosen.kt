package oop_00000130035_tamaraputrisalwa.week05

class Dosen(nama: String, val nind: String) : Pegawai(nama) {
    //WAJIB di-override karena fungsi bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yang dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}