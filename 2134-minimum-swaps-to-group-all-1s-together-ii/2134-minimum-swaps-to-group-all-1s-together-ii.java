class Solution {
    public int minSwaps(int[] nums) {
        
        
        
     
        int n = nums.length;
        int totalOnes = 0;

        // Count the total number of 1's in the array
        for (int num : nums) {
            totalOnes += num;
        }

        // If there are no 1's or the entire array is 1's, no swaps needed
        if (totalOnes == 0 || totalOnes == n) {
            return 0;
        }

        // Initialize the number of 1's in the current window
        int currentOnes = 0;

        // Create the first window of size totalOnes
        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        // Initialize minSwaps with the number of 0's in the first window
        int minSwaps = totalOnes - currentOnes;

        // Slide the window across the circular array
        for (int i = 1; i < n; i++) {
            // Subtract the element going out of the window
            currentOnes -= nums[i - 1];
            // Add the element coming into the window
            currentOnes += nums[(i + totalOnes - 1) % n];
            // Calculate the number of 0's in the current window
            int currentSwaps = totalOnes - currentOnes;
            // Update the minimum swaps
            minSwaps = Math.min(minSwaps, currentSwaps);
        }

        return minSwaps;
        
        
        
    }
}