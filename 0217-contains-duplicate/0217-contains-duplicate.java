// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Initialize a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the HashSet, return true
            if (set.contains(num)) {
                return true;
            }
            // Otherwise, add the element to the HashSet
            set.add(num);
        }
        
        // If no duplicates are found, return false
        return false;
    }
}
