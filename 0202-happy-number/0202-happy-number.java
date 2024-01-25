class Solution {
    public boolean isHappy(int n) {
        
  int slow = n;
        int fast = n;

        do {
            slow = calculateSquareSum(slow);
            fast = calculateSquareSum(calculateSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int calculateSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}