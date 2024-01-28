package algorithms.searching

fun <T> linearSearch(array: Array<T>, key: T): Int {
    array.forEachIndexed { index, item ->
        if (item == key)
            return index
    }
    return -1
}