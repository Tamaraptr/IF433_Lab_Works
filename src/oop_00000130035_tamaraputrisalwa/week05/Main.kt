package oop_00000130035_tamaraputrisalwa.week05

fun main() {
    val dosen1 = Dosen( nama = "Pak Alex", nind ="0123456")
    val admin1 = Admin( nama = "Bu Siti")

    // Polymorphic Collection List yang berisi tipe Parent, tapi isisnya object anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIFITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN EROR karena tipe referensinya adalah pegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: $pegawai.nidn)")
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------------------")
    }
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(4)
    println("Luas Persegi (sisi = 4): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(5, 3)
    println("Luas Persegi Panjang (5 x 3): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0): $luasLingkaran")
}