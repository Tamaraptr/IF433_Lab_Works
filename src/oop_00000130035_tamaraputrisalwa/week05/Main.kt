package oop_00000130035_tamaraputrisalwa.week05

fun main() {
    println("=== AKTIFITAS PEGAWAI ===")

    val dosen1 = Dosen(nama = "Pak Alex", nind = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nind})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------------------")
    }


    println("\n=== MATH HELPER (OVERLOADING) ===")

    val math = MathHelper()

    val luasPersegi = math.hitungLuas(4)
    println("Luas Persegi (sisi = 4): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(5, 3)
    println("Luas Persegi Panjang (5 x 3): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0): $luasLingkaran")


    println("\n=== SIMULASI SISTEM PEMBAYARAN ===")

    val eWallet = EWallet("Tamara", 50000.0)
    val creditCard = CreditCard("Tamara", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethods) {
        method.processPayment(75000.0)
        println("---------------------------------")
    }
}