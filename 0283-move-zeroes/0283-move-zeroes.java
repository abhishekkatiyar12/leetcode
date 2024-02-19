class Solution {
    public void moveZeroes(int[] nums) {
    
      int count=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
              count++;
          } else if(nums[i]!=0){
              int temp=nums[i-count];
              nums[i-count]=nums[i];
              nums[i]=temp;
          }
      }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
        
    