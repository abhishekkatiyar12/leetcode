class Solution {
    public boolean isSameAfterReversals(int num) {
    
        int reversed1 = reverseInteger(num);
        int reversed2 = reverseInteger(reversed1);
        return reversed2 == num;
    }
    
    public static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
        
    }
}