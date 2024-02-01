class Solution {
    public int maximumProduct(int[] nums) {
    
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Maximum product can be either the product of the three largest elements
        // or the product of the two smallest elements (if they are negative) and the largest element
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two options
        return Math.max(option1, option2);        
    }
}