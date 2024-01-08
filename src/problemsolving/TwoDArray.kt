package problemsolving

fun multidimensionalArray() {
    // Creates a two-dimensional array
    val twoDArray: Array<Array<Int>> = Array(1) { i ->
        println("current value inside 2D array's inner array is $i")
        Array(3) { j ->
            println("current value inside 2D array's inner inner array is $j")
            j
        }
    }

    println("Size of metrics: ${twoDArray.size}")
    twoDArray[0][2] = 5
    println(twoDArray.contentDeepToString())

//    val threeDArray = Array(3) {
//        println("current value inside 3D array's inner array is $it")
//        Array(3) {
//            println("current value inside 3D array's inner inner array is $it")
//            Array(3) {
//                println("current value inside 3D array's inner inner inner array is $it")
//                it
//            }
//        }
//    }
//    println(threeDArray.contentDeepToString())
}

fun createMultiDimArray(row: Int, column: Int) {
    val mArray = Array(row) { rowIndex ->
        Array(column) { columnIndex ->
            println("Row index is : $rowIndex and columnIndex is: $columnIndex")
            "*"
        }
    }
    println(mArray.contentDeepToString())
}

fun main() {
    multidimensionalArray()
}