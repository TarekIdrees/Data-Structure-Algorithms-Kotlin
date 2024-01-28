package algorithms.sorting

import algorithms.swap

fun <T : Comparable<T>> heapSort(array: Array<T>, ascending: Boolean = true): Array<T> {
    buildHeap(array, array.size, ascending)
    for (i in array.size - 1 downTo 0) {
        swap(array, 0, i)
        heapify(array, i, 0, ascending)
    }
    return array
}

private fun <T : Comparable<T>> buildHeap(array: Array<T>, size: Int, ascending: Boolean) {
    for (i in (size / 2) - 1 downTo 0) {
        heapify(array, size, i, ascending)
    }
}

private fun <T : Comparable<T>> heapify(array: Array<T>, size: Int, i: Int, ascending: Boolean) {
    val l = 2 * i + 1
    val r = 2 * i + 2
    var max = i
    if (l < size && (ascending && array[l] > array[max] || !ascending && array[l] < array[max])) {
        max = l
    }

    if (r < size && (ascending && array[r] > array[max] || !ascending && array[r] < array[max])) {
        max = r
    }
    if (max != i) {
        swap(array, i, max)
        heapify(array, size, max, ascending)
    }
}