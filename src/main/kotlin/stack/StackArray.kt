package stack

import java.lang.Exception

class StackArray<T>() {
    private var top = -1
    private val items = mutableListOf<T>()

    fun push(item: T) {
        top++
        items.add(top, item)
    }

    fun pop() {
        try {
            items.removeAt(top)
            top--
        } catch (e: Exception) {
            throw Exception("You can't delete item, Stack is already empty")
        }
    }

    fun peek(): T {
        return try {
            items[top]
        } catch (e: Exception) {
            throw Exception("Stack is empty")
        }
    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun size(): Int {
        return items.size
    }

    fun print() {
        if (isEmpty()) {
            print("Stack is empty")
        } else {
            items.reversed().forEachIndexed { index, item ->
                if (index != top) {
                    print("$item, ")
                } else {
                    print(item)
                }
            }
        }
    }
}