package oop_00000130035_tamaraputrisalwa.week05

abstract class PaymentMethod(val accountName: String) {

    // Abstract function (WAJIB dioverride di class turunan)
    abstract fun processPayment(amount: Double)
}