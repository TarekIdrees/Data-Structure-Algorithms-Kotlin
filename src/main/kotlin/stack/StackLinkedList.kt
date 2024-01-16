package stack

import java.lang.Exception

class StackLinkedList<T> {
    inner class Node(var item: T? = null, var next: Node? = null)

    private var top: Node? = Node()

    fun push(newItem: T) {
        val newItemPtr = Node(newItem, top)
        top = newItemPtr
    }

    fun isEmpty() = top?.item == null

    fun pop() {
        if (isEmpty()) {
            println("Stack is empty !")
        } else {
            top = top?.next
        }
    }

    fun peek(): T? {
        return top?.item ?: throw Exception("Stack is empty")
    }

    fun print() {
        if (isEmpty()) {
            print("Stack is empty")
        } else {
            print("[")
            var tempNode = top
            while (tempNode?.next != null) {
                print(tempNode.item)
                tempNode = tempNode.next
                if (tempNode?.next != null)
                    print(",")
            }
            println("]")
        }
    }
}