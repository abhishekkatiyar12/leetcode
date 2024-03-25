class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for (int num : nums) {
            if (!set.add(num)) {
               list.add(num);
            }
        }
        
        return list;
    }
}
