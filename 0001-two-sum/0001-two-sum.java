class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n[]=new int [2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])) {
                n[0] = i;
                n[1] = map.get(target-nums[i]);
                return n;
            } else {
                map.put(nums[i], i);
            }
        }
        return n;
    }
}