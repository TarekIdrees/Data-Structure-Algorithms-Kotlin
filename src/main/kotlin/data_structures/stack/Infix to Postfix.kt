package data_structures.stack


private fun precedence(operator: Char): Int {
    return when (operator) {
        '+', '-' -> 1
        '*', '/' -> 2
        else -> 0
    }
}

fun infixToPostfix(infix: String): String {
    val result = StringBuilder()
    val stack = StackArray<Char>()

    for (token in infix) {
        when {
            token.isLetterOrDigit() -> result.append(token)
            isOperator(token) -> {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    result.append(stack.peek()).also { stack.pop() }
                }
                stack.push(token)
            }

            token == '(' -> stack.push(token)
            token == ')' -> {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.peek()).also { stack.pop() }
                }
                stack.pop() // Pop '('
            }
        }
    }

    while (!stack.isEmpty()) {
        result.append(stack.peek()).also { stack.pop() }
    }

    return result.toString()
}