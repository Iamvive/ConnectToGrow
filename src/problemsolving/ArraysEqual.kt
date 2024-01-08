package problemsolving

private fun areEqualArrays(firstArray: Array<Int>, secondArray: Array<Int>): Boolean {

    if (firstArray.size != secondArray.size) return false

    for (i in firstArray.indices) {
        if (firstArray[i] != secondArray[i]) {
            return false
        }
    }
    return true
}

fun main() {
    val firstArray = arrayOf(1, 7, 7)
    val secondArray = arrayOf(7, 7, 1)
    println(areEqualArrays(firstArray, secondArray))
}