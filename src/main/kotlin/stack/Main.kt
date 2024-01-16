package stack

fun main() {
    val stackArray = StackArray<String>()

    println("------------------Stack Array Test-----------------------")
    stackArray.push("Element 1")
    stackArray.push("Element 2")
    stackArray.push("Element 3")

    println("Peek: ${stackArray.peek()}")
    println("Pop: ${stackArray.pop()}")
    println("Peek after pop: ${stackArray.peek()}")
    println("Is stack empty: ${stackArray.isEmpty()}")
    println("Stack size: ${stackArray.size()}")
    println("Stack elements:")
    stackArray.print()

    println("---------------------------------------------")

    println("------------------Stack LinkedList Test-----------------------")
    val stackLinkedList = StackLinkedList<String>()
    stackLinkedList.push("Element 1")
    stackLinkedList.push("Element 2")
    stackLinkedList.push("Element 3")

    println("Peek: ${stackLinkedList.peek()}")
    println("Pop: ${stackLinkedList.pop()}")
    println("Peek after pop: ${stackLinkedList.peek()}")
    println("Is stack empty: ${stackLinkedList.isEmpty()}")
    println("Stack elements:")
    stackLinkedList.print()
}