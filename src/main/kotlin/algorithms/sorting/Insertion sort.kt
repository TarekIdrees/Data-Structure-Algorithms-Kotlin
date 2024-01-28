package algorithms.sorting

fun <T : Comparable<T>> insertionSort(array: Array<T>, ascending: Boolean = true): Array<T> {
    var key: T
    var j: Int
    for (i in 1 until array.size) {
        key = array[i]
        j = i - 1
        while (j >= 0 && ((ascending && array[j] > key) || (!ascending && array[j] < key))) {
            array[j + 1] = array[j]
            j -= 1
        }

        array[j + 1] = key
    }
    return array
}