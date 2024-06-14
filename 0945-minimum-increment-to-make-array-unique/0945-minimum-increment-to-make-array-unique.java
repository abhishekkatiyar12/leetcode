class Solution {
    public int minIncrementForUnique(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int moves=0;
       int prev=nums[0];
        for(int i=1;i<nums.length;i++){

           if(nums[i]<=prev){
            moves+= prev +1-nums[i];
                nums[i]=prev+1;
                }
            prev=nums[i];
        }
        return moves;
    }
}