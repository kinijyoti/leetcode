class Parenthesis {
    fun isValid(s: String): Boolean {
        // Stack to hold opening brackets
        val stack = mutableListOf<Char>()
        // Map to match closing brackets to their corresponding opening brackets
        val bracketMap = mapOf(')' to '(', '}' to '{', ']' to '[')

        for (char in s) {
            when (char) {
                '(', '{', '[' -> {
                    stack.add(char) // Push opening brackets onto the stack
                }
                ')', '}', ']' -> {
                    // Check if the stack is empty or the top element doesn't match the corresponding opening bracket
                    if (stack.isEmpty() || stack.last() != bracketMap[char]) {
                        return false
                    }
                    stack.removeAt(stack.size - 1) // Pop the top element from the stack
                }
            }
        }

        // If the stack is empty, all opening brackets were matched with closing ones
        return stack.isEmpty()
    }
}