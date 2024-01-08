package problemsolving

import kotlin.math.sqrt

private fun trace(firstMetrics: Array<IntArray>) {
    var squareSum = 0.0
    val rows = firstMetrics.size
    val columns = firstMetrics.first().size

    for (row in 0 until rows) {
        for (column in 0 until columns) {
            squareSum += firstMetrics[row][column] * firstMetrics[row][column]
        }
    }
    println("Normal of array is: ${sqrt(squareSum).toInt()}")

}

fun main() {
    val firstMetrics = arrayOf(
            intArrayOf(1, 4, 4),
            intArrayOf(2, 3, 7),
            intArrayOf(0, 5, 1),
    )

    trace(firstMetrics)
}