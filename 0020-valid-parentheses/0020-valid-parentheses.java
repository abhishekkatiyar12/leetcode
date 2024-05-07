import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Check if the string length is even, as a valid sequence of parentheses must have pairs
        if (s.length() % 2 != 0) {
            return false;
        }

        // Create a stack to store opening parentheses
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
               
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top element from the stack and check if it matches the current closing parenthesis
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all parentheses have been matched
        return stack.isEmpty();
    }
}
