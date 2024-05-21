class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>()); // Start with the empty subset

        // For each number in nums, add it to all existing subsets
        for (int i = 0; i < nums.length; i++) {
            int currentSize = list.size();
            for (int j = 0; j < currentSize; j++) {
                List<Integer> list2 = new ArrayList<>(list.get(j));
                list2.add(nums[i]);
                list.add(list2);
            }
        }

        return list;
    }
}