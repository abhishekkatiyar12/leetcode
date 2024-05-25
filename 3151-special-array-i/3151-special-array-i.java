class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int first;
        int second;
        for(int i=0;i<nums.length-1;i++){
            first=nums[i];
            second=nums[i+1];
            if((first%2==0&&second%2!=0)||(first%2!=0&&second%2==0)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}