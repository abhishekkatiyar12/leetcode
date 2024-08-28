class Solution {
    public int threeSumClosest(int[] nums, int target) {
              Arrays.sort(nums);  // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize with the first possible sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // If the current sum is closer to the target, update the closestSum
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move the pointers based on the comparison between currentSum and target
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // If the currentSum equals the target, it's the closest possible sum
                    return currentSum;
                }
            }
        }

        return closestSum;
    }
}