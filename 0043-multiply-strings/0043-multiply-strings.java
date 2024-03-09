class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) // If either number is zero, return "0"
            return "0";
        
        int len1 = num1.length();
        int len2 = num2.length();
        int[] resultArray = new int[len1 + len2]; // Array to store intermediate results
        
        // Perform multiplication digit by digit
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int multiply = digit1 * digit2;
                int sum = multiply + resultArray[i + j + 1]; // Add to the previous intermediate result
                resultArray[i + j] += sum / 10; // Carry over to the next position
                resultArray[i + j + 1] = sum % 10; // Store the remainder as the current digit
            }
        }
        
        // Convert resultArray to string
        StringBuilder result = new StringBuilder();
        for (int digit : resultArray) {
            if (!(result.length() == 0 && digit == 0)) { // Skip leading zeros
                result.append(digit);
            }
        }
        
        return result.toString();
    }
}
