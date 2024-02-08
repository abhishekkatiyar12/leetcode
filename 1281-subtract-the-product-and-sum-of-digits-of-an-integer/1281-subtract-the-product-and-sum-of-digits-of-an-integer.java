class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        // Iterate through each digit of the number
        while (n != 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;   // Multiply the digit to the product
            sum += digit;       // Add the digit to the sum
            n /= 10;            // Move to the next digit by removing the last digit
        }

        // Calculate the difference between product and sum
        return product - sum;
    }
}