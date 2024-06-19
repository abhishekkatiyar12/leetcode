class Solution {
    public boolean judgeSquareSum(int c) {
        int l = 0;
        long r = (long) Math.sqrt(c);  
        while (l <= r) {
            int a = l * l;
            long b = r * r;  
            if (a + b < c) {
                l++;
            } else if (a + b > c) {
                r--;
            } else {
                return true;  // a + b == c
            }
        }
        return false;  // No valid pair found
    }
}
