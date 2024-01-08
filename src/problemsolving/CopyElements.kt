package problemsolving

fun copyElements(array: Array<Int>): Array<Int> {
    val copiedArray = Array<Int>(array.size) { 0 }
    for (i in array.indices) {
        copiedArray[i] = array[i]
    }

    return copiedArray
}

fun main() {
    val copiedArray = copyElements(arrayOf(1, 2, 4, 5))
    println(copiedArray.toList().toString())
}