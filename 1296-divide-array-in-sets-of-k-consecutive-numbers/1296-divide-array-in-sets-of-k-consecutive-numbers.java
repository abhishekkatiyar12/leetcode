import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int loop = nums.length / k;
        if (nums.length % k != 0) {
            return false;
        }
        
        // Frequency map to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Sorting the array to handle consecutive sequences
        Arrays.sort(nums);
        
        for (int num : nums) {
            if (countMap.get(num) == 0) {
                continue; // Skip if this number is already used completely
            }
            
            // Check if we can form a consecutive sequence starting with `num`
            for (int i = 0; i < k; i++) {
                int current = num + i;
                if (countMap.getOrDefault(current, 0) == 0) {
                    return false;
                }
                countMap.put(current, countMap.get(current) - 1);
            }
        }
        
        return true;
    }
}
