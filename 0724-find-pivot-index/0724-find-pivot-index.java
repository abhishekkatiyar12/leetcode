class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int sum = 0;

        // finding the sum
        for (int num : nums) {
            sum += num;
        }

        // returning the index if length is one
        if (nums.length == 1) {
            return 0;
        }

        // checking where the leftSum becomes equal to rightSum
        int leftSum = 0;
        int rightSum = sum;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) {
                pivot = i;
                break;
            }
            leftSum += nums[i];
        }
        return pivot;
    }
}
