package problemsolving.utils

object ArraysUtils {
    fun reverseArray(
            array: Array<Int>,
            startIndex: Int,
            endIndex: Int,
    ): Array<Int> {
        var tempStartIndex = startIndex
        var tempEndIndex = endIndex
        while (tempStartIndex <= tempEndIndex) {
            val temp = array[tempStartIndex]
            array[tempStartIndex] = array[tempEndIndex]
            array[tempEndIndex] = temp

            tempStartIndex++
            tempEndIndex--
        }
        return array
    }

    fun swap(array: Array<Int>, firstIndex: Int, otherIndex: Int) {

    }
}