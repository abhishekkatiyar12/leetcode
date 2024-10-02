class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        int index=-1;
        for(int num:nums){
            index++;
            if(num==target){
                list.add(index);                
            }
        }
        return list;
    }
}