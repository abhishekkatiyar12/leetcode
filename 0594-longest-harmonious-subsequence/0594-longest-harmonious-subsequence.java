import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        // Create a HashMap to store the frequency of each number in nums
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLHSLength = 0;
        
        // Iterate over the keys in the frequency map
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(key + 1)) {
                int currentLHSLength = frequencyMap.get(key) + frequencyMap.get(key + 1);
                maxLHSLength = Math.max(maxLHSLength, currentLHSLength);
            }
        }
        
        return maxLHSLength;
    }
}
