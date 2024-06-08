
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store the remainder when prefix sum is divided by k and its index
        Map<Integer, Integer> remainderMap = new HashMap<>();
        // Initialize with remainder 0 at index -1
        remainderMap.put(0, -1);
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            
            // Handle negative remainders (for negative numbers in the array)
            if (remainder < 0) {
                remainder += k;
            }
            
            // If remainder has been seen before, check the subarray length
            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of the remainder
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }   
    }