class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                left = mid + 1;
                result = mid;  // mid is a potential result
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}