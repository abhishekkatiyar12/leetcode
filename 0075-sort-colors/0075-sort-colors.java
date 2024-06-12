class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
            countZero++;
            }else if(nums[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }
            
            int index=0;
          while(countZero>0){
            nums[index]=0;
            countZero--;
            index++;
          }
            while(countOne>0){
            nums[index]=1;
            countOne--;
            index++;
          }       
            while(countTwo>0){
            nums[index]=2;
            countTwo--;
            index++;
          }
         
        }
    }
