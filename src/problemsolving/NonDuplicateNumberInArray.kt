package problemsolving

fun main() {

}

private fun printNonDuplicateArray(array: Array<Int>) { // 1 2 1 2 4
    val map = mutableMapOf<Int, Int>()
    for (i in array.indices) {
        map[array[i]] = i // 1,1   2,3  4,4
    }
}