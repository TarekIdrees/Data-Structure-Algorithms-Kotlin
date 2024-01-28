package algorithms.searching

fun <T : Comparable<T>> binarySearch(array: Array<T>, low: Int, high: Int, key: T): Int {

    if (low <= high) {
        val mid = (low + high) / 2

        if (array[mid] == key) {
            return mid
        }
        if (array[mid] > key)
            return binarySearch(array, low, mid - 1, key)

        return binarySearch(array, mid + 1, high, key)
    }
    return -1
}