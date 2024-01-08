package problemsolving

private fun trace(firstMetrics: Array<IntArray>) {
    val rows = firstMetrics.size
    val columns = firstMetrics.first().size

    val transposedMetrics = Array(columns) {
        Array(rows) { 0 }
    }

    for (row in 0 until rows) { // 0 //1
        for (column in 0 until columns) { // 0 1 //0 // 1
            transposedMetrics[column][row] = firstMetrics[row][column]
        }
    }

    println(transposedMetrics.contentDeepToString())
}

fun main() {
    val firstMetrics = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
    )

    trace(firstMetrics)

}