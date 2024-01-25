package algorithms

fun <T : Comparable<T>> swap(array: Array<T>, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}