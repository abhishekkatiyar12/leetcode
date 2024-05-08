import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Check if the length of the string is odd
        if (s.length() % 2 != 0) {
            return false; // Return false immediately if the length is odd
        }
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar); // Push opening brackets onto the stack
            } else {
                // Check if stack is empty before trying to peek or pop
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no matching opening bracket
                }
                
                char topChar = stack.pop(); // Pop the top character from the stack
                
                // Check if the popped opening bracket matches the current closing bracket
                if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == '}' && topChar != '{') ||
                    (currentChar == ']' && topChar != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
       
        // After processing all characters, stack should be empty if all brackets matched
        return stack.isEmpty();
    }
}
