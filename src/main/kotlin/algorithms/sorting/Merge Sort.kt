package algorithms.sorting

fun mergeSort(
    array: IntArray,
    firstIndex: Int = 0,
    lastIndex: Int = array.size - 1,
): IntArray {
    if (array.size <= 1) {
        return array
    }
    val middleIndex = (firstIndex + lastIndex) / 2
    val leftArray = array.copyOfRange(firstIndex, middleIndex + 1)
    val rightArray = array.copyOfRange(middleIndex + 1, lastIndex + 1)

    return merge(mergeSort(leftArray), mergeSort(rightArray))
}

private fun merge(
    leftArray: IntArray,
    rightArray: IntArray,
): IntArray {
    val mergedArray = IntArray(leftArray.size + rightArray.size)
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    while (leftIndex < leftArray.size && rightIndex < rightArray.size) {
        if (leftArray[leftIndex] <= rightArray[rightIndex]) {
            mergedArray[mergedIndex] = leftArray[leftIndex]
            leftIndex++
        } else {
            mergedArray[mergedIndex] = rightArray[rightIndex]
            rightIndex++
        }
        mergedIndex++
    }

    while (leftIndex < leftArray.size) {
        mergedArray[mergedIndex] = leftArray[leftIndex]
        leftIndex++
        mergedIndex++
    }

    while (rightIndex < rightArray.size) {
        mergedArray[mergedIndex] = rightArray[rightIndex]
        rightIndex++
        mergedIndex++
    }
    return mergedArray
}