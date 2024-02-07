class Solution {
    public int numIdenticalPairs(int[] nums) {
       
        int count = 0;
        // Create an array to store the count of occurrences of each number
        int[] occurrences = new int[101]; // Since nums[i] is in the range [1, 100]
        
        // Count occurrences of each number
        for (int num : nums) {
            occurrences[num]++;
        }
        
        // Count good pairs
        for (int i = 1; i <= 100; i++) {
            // If there are more than one occurrence of a number,
            // we can form good pairs using combination C(occurrences[i], 2)
            if (occurrences[i] > 1) {
                count += (occurrences[i] * (occurrences[i] - 1)) / 2;
            }
        }
        
        return count;        
    }
}