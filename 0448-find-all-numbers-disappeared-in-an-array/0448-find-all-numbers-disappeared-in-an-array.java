import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer> disappearedNumbers = new ArrayList<>();
        
        // Add all numbers from the array to the set
        for (int num : nums) {
            numSet.add(num);
        }
        
        // Check numbers from 1 to nums.length, if not present in the set, add to disappearedNumbers
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                disappearedNumbers.add(i);
            }
        }
        
        return disappearedNumbers;
    }
}
