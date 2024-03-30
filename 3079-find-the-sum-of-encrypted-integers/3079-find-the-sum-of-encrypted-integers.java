class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }
    
    private int encrypt(int num) {
        int largestDigit = findLargestDigit(num);
        return Integer.parseInt(String.valueOf(largestDigit).repeat(String.valueOf(num).length()));
    }
    
    private int findLargestDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}
