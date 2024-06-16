class Solution {
    public int missingNumber(int[] nums) {
        
       int sum=nums.length*(nums.length+1)/2;
        int arraySum=0;
        for(int i=0;i<nums.length;i++){
            arraySum+=nums[i];
        }
        int missing= sum-arraySum;
        System.out.println(missing);
        return missing;
    }
}




    