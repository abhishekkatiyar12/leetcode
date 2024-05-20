class Solution {
    public int subsetXORSum(int[] nums) {
        int totalXorSum = 0;
        int subsetCount = 1 << nums.length; // 2^n subsets
        
        for (int i = 0; i < subsetCount; i++) {
            int currentXor = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    currentXor ^= nums[j];
                }
            }
            totalXorSum += currentXor;
        }
        
        return totalXorSum;
    }
}
