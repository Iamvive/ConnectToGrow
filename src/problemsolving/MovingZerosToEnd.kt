package problemsolving

private fun movingZeros(array: Array<Int>) {

    val tempArray = mutableListOf<Int>()

    for (i in array.indices) {
        println("Index is ${array[i]}")
        if (array[i] != 0) {
            tempArray.add(array[i])
        }
    }

    for (i in tempArray.size until array.size) {
        tempArray.add(0)
    }

    println(tempArray.toList().toString())
}

private fun optimumApproach(array: Array<Int>) {
    var lastZeroIndex = -1
    for (i in array.indices) {
        if (array[i] == 0) {
            lastZeroIndex = i
            break
        }
    }

    for (i in lastZeroIndex + 1 until array.size) {
        if (array[i] != 0) {
            val temp = array[i]
            array[i] = array[lastZeroIndex]
            array[lastZeroIndex] = temp
            lastZeroIndex++
        }
    }

    println(array.toList().toString())

}

fun main() {
    val array = arrayOf(0, 2, 3, 4, 0, 7, 0, 9)
    optimumApproach(array)
}