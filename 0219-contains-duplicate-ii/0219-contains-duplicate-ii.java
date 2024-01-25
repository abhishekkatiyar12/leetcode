class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
   
        // Map to store the last index of each element
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Check if the element is already in the map
            if (indexMap.containsKey(num)) {
                // If the absolute difference between the current index and the previous index is at most k, return true
                if (i - indexMap.get(num) <= k) {
                    return true;
                }
            }

            // Update the index of the current element in the map
            indexMap.put(num, i);
        }

        // No such indices found
        return false;
    }

//   
}
