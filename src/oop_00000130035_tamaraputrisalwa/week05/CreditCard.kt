package oop_00000130035_tamaraputrisalwa.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi sebesar Rp$amount berhasil menggunakan Credit Card.")
            println("Sisa limit: Rp${limit - usedAmount}")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu kredit.")
        }
    }
}