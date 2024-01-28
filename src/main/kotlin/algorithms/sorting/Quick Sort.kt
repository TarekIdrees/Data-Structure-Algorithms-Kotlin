package algorithms.sorting

import algorithms.swap

fun <T : Comparable<T>> quickSort(array: Array<T>, l: Int, h: Int,ascending: Boolean = true): Array<T> {
    if (l < h) {
        val pivot = partition(array, l, h,ascending)
        quickSort(array, l, pivot - 1,ascending)
        quickSort(array, pivot + 1, h,ascending)
    }
    return array
}

private fun <T : Comparable<T>> partition(array: Array<T>, l: Int, h: Int,ascending: Boolean): Int {
    val pivot = array[h]
    var i = l - 1

    for (j in l until h) {
        val comparisonResult = array[j].compareTo(pivot)
        if (ascending) {
            if (comparisonResult <= 0) {
                i++
                swap(array, i, j)
            }
        } else {
            if (comparisonResult >= 0) {
                i++
                swap(array, i, j)
            }
        }
    }

    swap(array, i + 1, h)
    return i + 1
}

