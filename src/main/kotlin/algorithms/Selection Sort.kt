package algorithms

fun <T : Comparable<T>> selectionSort(array: Array<T>, ascending: Boolean = true): Array<T> {
    var judgeIndex: Int
    for (index in array.indices) {
        judgeIndex = index
        for (i in index + 1 until array.size) {
            if (!ascending) {
                if (array[i] > array[judgeIndex]) {
                    judgeIndex = i
                }
            } else {
                if (array[i] < array[judgeIndex]) {
                    judgeIndex = i
                }
            }
        }
        val temp = array[index]
        array[index] = array[judgeIndex]
        array[judgeIndex] = temp
    }
    return array
}