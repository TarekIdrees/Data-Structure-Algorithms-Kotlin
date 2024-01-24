package data_structures.stack

import java.lang.Exception

class StackArray<T>() {
    private var top = -1
    private val items = mutableListOf<T>()

    fun push(item: T) {
        items.add(item)
        top++
    }

    fun pop() {
        try {
            items.removeAt(top)
            top--
        } catch (e: Exception) {
            throw Exception("You can't delete item, Stack is already empty")
        }
    }

    fun pop(item: T) {
        if (items.contains(item)) {
            items.remove(item)
            top--
        } else {
            println("item not found to be removed !")
        }
    }

    fun peek(): T {
        return try {
            items[top]
        } catch (e: Exception) {
            throw Exception("Stack is empty to be peeked")
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
            println("Stack is empty to be printed !")
        } else {
            items.reversed().forEachIndexed { index, item ->
                if (index != top) {
                    print("$item, ")
                } else {
                    println(item)
                }
            }
        }
    }
}