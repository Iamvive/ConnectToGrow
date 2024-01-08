package problemsolving

private fun trace(firstMetrics: Array<IntArray>) {
    var traceOfMetrics = 0
    val rows = firstMetrics.size

    for (i in 0 until rows) {
        traceOfMetrics += firstMetrics[i][i]
    }

    println("Trace of metrics is : $traceOfMetrics")
}

fun main() {
    val firstMetrics = arrayOf(
            intArrayOf(8, 9, 11),
            intArrayOf(0, 1, 15),
            intArrayOf(4, 10, -7),
    )

    trace(firstMetrics)
}