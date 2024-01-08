class FakePayment {
    private lateinit var orderId: String

    fun firstCalled() {
        orderId = "1"
    }

    fun onCreate() {
        createOrder(orderId)
    }

    private fun createOrder(orderId: String) {

    }
}

fun main() {
   val payment = FakePayment()

    payment.firstCalled()
   payment.onCreate()
}