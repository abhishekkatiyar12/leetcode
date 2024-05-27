class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        
        int n = nums.length;
        // Iterate over all possible values of x from 0 to n
        for (int x = 0; x <= n; x++) {
            int count = 0;
            // Count numbers greater than or equal to x
            for (int i = 0; i < n; i++) {
                if (nums[i] >= x) {
                    count = n - i;  // Remaining elements in sorted array are >= x
                    break;
                }
            }
            // Check if the count matches x
            if (count == x) {
                return x;
            }
        }
        // If no valid x is found, return -1
        return -1;
    }
}