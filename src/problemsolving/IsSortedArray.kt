package problemsolving

fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(2, 3, 5, 6, 5, 4)

    println(isSortedArray(array1))
    println(isSortedArray(array2))
}

private fun isSortedArray(array: Array<Int>): Boolean {
    var currentNumber = array[0];
    for (i in array.indices) {
        if (currentNumber > array[i]) return false
        currentNumber = array[i]
    }
    return true
}