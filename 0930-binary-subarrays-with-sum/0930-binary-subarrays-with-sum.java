class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        // int tempsum=0;
        for(int i=0;i<nums.length;i++){
             int tempsum=0;
            tempsum+=nums[i];
            if(tempsum==goal){
                count++;
            }
            for(int j=i+1;j<nums.length;j++){
                tempsum+=nums[j];
                if(tempsum==goal){
                    count++;
                    continue;
                }
                if(tempsum>goal){
                    break;
                }
            }
        }
        return count;
    }
}