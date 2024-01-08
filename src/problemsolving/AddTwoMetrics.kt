package problemsolving

import java.lang.Exception

private fun addTwoMetrics(firstMetrics: Array<IntArray>, secondMetrics: Array<IntArray>) {
    println("Size of metrics is : ${firstMetrics.size}")
    if (firstMetrics.size != secondMetrics.size) throw Exception("Metrics size should be same")

    val sumArray = Array(firstMetrics.size) {
        Array(firstMetrics.size) {
            0
        }
    }

    val rows = firstMetrics.size
    val columns = firstMetrics[0].size

    for (row in 0 until rows) {
        for (column in 0 until columns) {
            sumArray[row][column] = firstMetrics[row][column] + secondMetrics[row][column]
        }
    }

    println(sumArray.contentDeepToString())
}

fun main() {
    val firstMetrics = arrayOf(
            intArrayOf(2,4),
            intArrayOf(3, 4)
    )

    val secondMetrics = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3)
    )

    addTwoMetrics(firstMetrics, secondMetrics)

}