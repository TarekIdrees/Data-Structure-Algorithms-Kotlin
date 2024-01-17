package stack

fun arePair(open: Char, closed: Char): Boolean {
    return if (open == '(' && closed == ')') {
        true
    } else if (open == '{' && closed == '}') {
        true
    } else open == '[' && closed == ']'
}

fun areBalanced(exp: String): Boolean {
    val container = StackArray<Char>()
    if (!exp.any { it in "({[)}]" }) {
        return false
    }
    exp.forEach { item ->
        if ("({[".contains(item)) {
            container.push(item)
        } else if (")}]".contains(item)) {
            if (container.isEmpty() || !arePair(container.peek(), item))
                return false
            else
                container.pop()
        }
    }
    return container.isEmpty()
}