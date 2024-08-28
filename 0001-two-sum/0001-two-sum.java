
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int complement = target - temp; // Calculate the complement needed to reach the target

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return the indices of the two numbers
            }
            

            map.put(temp, i);
        }

        return new int[0];
    }
}
