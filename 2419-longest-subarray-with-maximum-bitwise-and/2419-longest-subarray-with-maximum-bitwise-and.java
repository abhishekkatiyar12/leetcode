class Solution {
    public int longestSubarray(int[] nums) {
       
   int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // Step 2: Find the longest subarray where all elements are equal to maxVal.
        int maxLength = 0;
        int currentLength = 0;
        
        for (int num : nums) {
            if (num == maxVal) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        
        // After the loop, check one last time for the last subarray
        maxLength = Math.max(maxLength, currentLength);
        
        return maxLength;
    }
}