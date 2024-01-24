package algorithms

fun main() {
    var array = arrayOf(80, 20, 70, 90, 2, 55)
    array = selectionSort(array,false)
    array.forEach {
        print("$it,")
    }
}