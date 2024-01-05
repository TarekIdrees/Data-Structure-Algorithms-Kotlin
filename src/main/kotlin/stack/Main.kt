package stack

fun main(){
    val stack = StackArray<String>()

    stack.push("Element 1")
    stack.push("Element 2")
    stack.push("Element 3")

    println("Peek: ${stack.peek()}")
    println("Pop: ${stack.pop()}")
    println("Peek after pop: ${stack.peek()}")
    println("Is stack empty: ${stack.isEmpty()}")
    println("Stack size: ${stack.size()}")
    println("Stack elements:")
    stack.print()
}