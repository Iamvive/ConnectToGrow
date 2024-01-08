package problemsolving

class ReverseArray {
    fun main() {
        val array = arrayOf(5, 7, 8, 10)
        println(reverseArray(array).toList().toString())
    }

    private fun reverseArray(array: Array<Int>): Array<Int> {
        val reverseArray = Array(array.size) { 0 }
        for (i in array.indices) {
            reverseArray[i] = array[(array.size - i) - 1]
        }
        return reverseArray
    }
}

private fun reverseArray(
        array: Array<Int>,
        startIndex: Int,
        endIndex: Int,
) {
    while (startIndex <= endIndex) {
        array[startIndex] = array[endIndex]

    }

}

fun main() {
    ReverseArray().main()
}