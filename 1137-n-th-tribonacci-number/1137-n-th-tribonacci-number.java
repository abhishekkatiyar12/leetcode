class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tribonacciHelper(n, 0, 1, 1);
    }

    private int tribonacciHelper(int n, int a, int b, int c) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        if (n == 2) {
            return c;
        }
        return tribonacciHelper(n - 1, b, c, a + b + c);
    }
}
