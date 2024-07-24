class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        
    while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                // Minimum element is in the right half
                left = mid + 1;
            } else {
                // Minimum element is in the left half including mid
                right = mid;
            }
        }
        
        // When left == right, we have found the minimum element
        return nums[left];
    

    }
}