package problemsolving

import problemsolving.utils.ArraysUtils.reverseArray

private fun rotation(array: Array<Int>, by: Int) {
    val length = array.size
    val finalBy = by % length
    val tempArray = Array(by) { 0 }
    for (i in 0 until by) {
        tempArray[i] = array[i]
    }

    for (i in by until length) {
        array[i - 2] = array[i]
    }

    for (i in length - finalBy until length) {
        array[i] = tempArray[i - (length - finalBy)]
    }

    println(array.toList().toString())
    println(tempArray.toList().toString())

}

private fun optimumRotation(array: Array<Int>, by: Int) {
    reverseArray(array, 0, by-1)
    reverseArray(array, by, array.size-1)
    val array = reverseArray(array, 0, array.size-1)
    println(array.toList().toString())
}

private fun rotationByOne(array: Array<Int>) {

    val temp = array[0]
    for (i in 1 until array.size) {
        array[i - 1] = array[i]
    }

    array[array.size - 1] = temp

    println("The rotation array is : ${array.toList().toString()}")
}

fun main() {
    val firstMetrics = arrayOf(
            1, 2, 3, 4, 5, 6,
    )

//    rotationByOne(firstMetrics)
//    rotation(firstMetrics, 2)
    optimumRotation(firstMetrics, 2)
}