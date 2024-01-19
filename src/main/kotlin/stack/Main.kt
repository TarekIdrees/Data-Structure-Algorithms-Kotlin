package stack

fun main() {
    val stackArray = StackArray<String>()

    println("------------------Stack Array Test-----------------------")
    stackArray.push("Element 1")
    stackArray.push("Element 2")
    stackArray.push("Element 2.5")
    stackArray.push("Element 3")

    println("Peek: ${stackArray.peek()}")
    println("Pop: ${stackArray.pop()}")
    println("Pop specific item:${stackArray.pop("Element 1")} ")
    println("Pop specific item:${stackArray.pop("Element 00000")} ")
    println("Peek after pop: ${stackArray.peek()}")
    println("Is stack empty: ${stackArray.isEmpty()}")
    println("Stack size: ${stackArray.size()}")
    print("Stack elements: ")
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

    println("---------------------------------------------")

    println("------------------Balanced Parentheses Test-----------------------")
    val expression = "9+5(2-1){}]"
    if (areBalanced(expression))
        println("Expression are balanced")
    else
        println("Expression are not balanced")


    println("---------------------------------------------")

    println("------------------Expression Evaluation Test-----------------------")
    val expressionTest = "52+3*"
//    val expressionTestTwo = "%52+3*"
//    val expressionTestThree = "523"
//    val expressionTestFour = "52+3*%&&"
    println(calculatePostfix(expressionTest))
//    println(calculatePostfix(expressionTestTwo))
//    println(calculatePostfix(expressionTestThree))
//    println(calculatePostfix(expressionTestFour))

    println("---------------------------------------------")

    println("------------------Infix to Postfix Test-----------------------")
    val infixExpression = "a+b*c-(d/e+f)"
    val postfixExpression = infixToPostfix(infixExpression)
    println("Infix Expression: $infixExpression")
    println("Postfix Expression: $postfixExpression")
}