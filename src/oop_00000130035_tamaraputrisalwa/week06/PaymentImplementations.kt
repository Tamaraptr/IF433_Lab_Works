package oop_00000130035_tamaraputrisalwa.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount")}
}