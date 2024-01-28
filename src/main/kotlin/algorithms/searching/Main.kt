package algorithms.searching

fun main() {
    val array = arrayOf(10, 50, 80, 9, 1, 60)
    val key = 1
    println(linearSearch(array, key))
    println(binarySearch(array.sortedArray(), array.indices.first, array.indices.last, 9))
}