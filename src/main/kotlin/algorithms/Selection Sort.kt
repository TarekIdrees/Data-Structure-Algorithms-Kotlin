package algorithms

fun <T : Comparable<T>> selectionSort(array: Array<T>, ascending: Boolean = true): Array<T> {
    var judgeIndex: Int
    for (index in array.indices) {
        judgeIndex = index
        for (i in index + 1 until array.size) {
            val comparisonResult = array[i].compareTo(array[judgeIndex])
            if ((ascending && comparisonResult < 0) || (!ascending && comparisonResult > 0)) {
                judgeIndex = i
            }
        }
        val temp = array[index]
        array[index] = array[judgeIndex]
        array[judgeIndex] = temp
    }
    return array
}