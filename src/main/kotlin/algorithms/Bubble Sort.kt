package algorithms

fun <T : Comparable<T>> bubbleSort(array: Array<T>, ascending: Boolean = true): Array<T> {
    var isSorted = true
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            val comparisonResult = array[j].compareTo(array[j + 1])
            if ((ascending && comparisonResult < 0) || (!ascending && comparisonResult > 0)) {
                swap(array, j, j + 1)
                isSorted = false
            }
        }
        if (isSorted)
            break
    }
    return array
}