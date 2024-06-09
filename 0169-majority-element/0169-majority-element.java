// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0];
//         int count = 1;

       
//         for (int i = 1; i < nums.length; i++) {
//             if (count == 0) {
//                 candidate = nums[i];
//                 count = 1;
//             } else if (nums[i] == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         return candidate;
//     }

        
    
// }

class Solution {
    public int majorityElement(int[] nums) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        // Iterate through the array and update the count of each element in the HashMap
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // Check if the current element's count exceeds the majority count
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }

        // If no majority element is found (though the problem guarantees one), return -1 as a fallback
        return -1;
    }
}
