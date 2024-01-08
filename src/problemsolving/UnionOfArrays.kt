package problemsolving

fun main() {
    val firstArray = arrayOf(1, 1, 2, 3, 4, 5)
    val secondArray = arrayOf(2, 3, 4, 4, 5)

    val uni = betterApproach(firstArray, secondArray)
    println(uni.toList().toString())
}

private fun getUnionArray(
        firstArray: Array<Int>,
        secondArray: Array<Int>,
): Array<Int> {
    val unionArray = mutableListOf<Int>()

    for (i in firstArray.indices) {
        if (!unionArray.contains(firstArray[i])) {
            unionArray.add(firstArray[i])
        }
    }

    for (i in secondArray.indices) {
        if (!unionArray.contains(firstArray[i])) {
            unionArray.add(firstArray[i])
        }
    }

    return unionArray.toTypedArray()

}

private fun betterApproach(
        firstArray: Array<Int>,
        secondArray: Array<Int>,
) :Array<Int> {
    val numberSet = mutableSetOf<Int>()

    firstArray.forEach {
        numberSet.add(it)
    }

    secondArray.forEach { numberSet.add(it) }

    return numberSet.toTypedArray()
}