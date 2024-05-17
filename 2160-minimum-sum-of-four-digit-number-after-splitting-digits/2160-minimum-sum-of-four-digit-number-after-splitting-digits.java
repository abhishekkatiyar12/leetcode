class Solution {
    public int minimumSum(int num) {
         char[] digits = Integer.toString(num).toCharArray();
        
        // Convert characters to integers and sort the array
        int[] intDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            intDigits[i] = digits[i] - '0';
        }
        Arrays.sort(intDigits);
        
        // Form the two new numbers by distributing the digits
        int new1 = intDigits[0] * 10 + intDigits[2];
        int new2 = intDigits[1] * 10 + intDigits[3];
        
        // Return the sum of the two new numbers
        return new1 + new2;
    }
}