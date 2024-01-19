package stack

import java.lang.Exception

const val OPERATORS = "+-*%/"
fun calculatePostfix(expression: String): Double {
    val stack = StackArray<String>()

    checkExpressionValidation(expression.trim())

    expression.forEach { item ->
        if (item.isDigit()) {
            stack.push(item.toString())
        } else {
            val operandTwo = stack.peek().toDouble()
            stack.pop()
            val operandOne = stack.peek().toDouble()
            stack.pop()
            val result = preformOperation(operandOne, operandTwo, item)
            stack.push(result)
        }
    }

    return stack.peek().toDouble()
}

private fun checkExpressionValidation(expression: String) {
    if (isOperator(expression.first())) {
        throw Exception("Not allowed to start with operator !")
    }
    if (expression.all { it.isDigit() }) {
        throw Exception("Not allowed for expression to be numbers only !")
    }
    if (expression.any { it !in OPERATORS && !it.isDigit() }) {
        throw Exception("Expression should only contain numbers and operands !")
    }
}

private fun preformOperation(operandOne: Double, operandTwo: Double, operator: Char): String {
    return when (operator) {
        '-' -> (operandOne - operandTwo).toString()
        '+' -> (operandOne + operandTwo).toString()
        '/' -> (operandOne / operandTwo).toString()
        '%' -> (operandOne % operandTwo).toString()
        '*' -> (operandOne * operandTwo).toString()
        else -> {
            "0.0"
        }
    }
}

private fun isOperator(item: Char): Boolean {
    return item in OPERATORS
}