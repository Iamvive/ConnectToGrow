package problemsolving

fun largestElement(array: Array<Int>): Int {
    var largestElement: Int = array.first()
    for (i in array.indices) {
        if (array[i] > largestElement) {
            largestElement = array[i]
        }
    }
    return largestElement
}

fun main() {
    val array = arrayOf(200, 1, 50, 5, 3)
    val largestEle = largestElement(array)
    println("Largest element in the array is : $largestEle")
}