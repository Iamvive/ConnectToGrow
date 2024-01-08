package kotlib

fun main() {
    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
    val fake = FakeScope()
    fake.doLet(numbers)
    fake.doWith(numbers)
    println(fake.doAlso(5))

    val f = FakeInfix()
    f.invoke()
}

class FakeScope {
    fun doLet(numbers: List<String>) {
        val anyObject = null
        anyObject?.let {

        }

        numbers.map { it.length }
                .filter { it > 3 }
                .let { number ->
                    println("The length is $number")
                }
    }

    fun doWith(numbers: List<String>) {
        val newNumber = with(numbers) {
            this.map { it.length }
                    .filter { it > 3 }
        }

        println(newNumber)
    }

    fun doAlso(number: Int) = (number * number).also {
        number + 1
    }
}

class FakeInfix {

    fun invoke() {
        println("The addition is ${4 add 5}")
    }

    private infix fun Int.add(value: Int) = this + value

    fun guide() {
        print("guide start")
        teach {
            print("teach")
            return
        }
        print("guide end")
    }

    inline fun teach( abc: () -> Unit) {
        abc()
    }

}