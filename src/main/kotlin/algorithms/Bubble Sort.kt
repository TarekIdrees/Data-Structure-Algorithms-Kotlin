package algorithms

fun <T : Comparable<T>> bubbleSort(array: Array<T>,ascending: Boolean = true): Array<T> {
    var isSorted = true
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            val comparisonResult = array[j].compareTo(array[j + 1])
            if ((ascending && comparisonResult < 0) || (!ascending && comparisonResult > 0)) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp

                isSorted = false
            }
        }
        if (isSorted)
            break
    }
    return array
}