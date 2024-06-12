import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base case for valid substring starting from the beginning
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Push the index of '(' onto the stack
            } else {
                stack.pop(); // Pop the top of the stack for ')'
                if (stack.isEmpty()) {
                    stack.push(i); // Push the current index as a new base
                } else {
                    // Calculate the length of the current valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength; // Return the maximum length of valid parentheses found
    }
}
