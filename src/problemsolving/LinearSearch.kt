package problemsolving

fun main() {
    val array = arrayOf(1, 2,3,4)
    val searchedIndex = doLinearSearch(array, 8)
    println(searchedIndex)
}

private fun doLinearSearch(
        array:Array<Int>,
        numb:Int,
) : Int {
    for (i in array.indices) {
        if (array[i] == numb) return i
    }
    return -1
}