package kotlib

class FakeEquals {
    fun invoke() {
        val car1 = CAR("Swift")
        val car2 = CAR("Swift")
        println("Result: ${car1 == car2}")
    }

}

class CAR(val name: String) {
    override fun equals(other: Any?): Boolean {
        return name == other
    }
}

fun main() {
    val fake = FakeEquals()
    fake.invoke()
}