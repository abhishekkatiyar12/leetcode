class Solution {
    public int[] leftRightDifference(int[] nums) {
      
       
        int length=nums.length;
        int[] sumleft=new int[length];
        int[] sumright=new int[length];
        int[] answer=new int[length];
        int sum=0;
        int result;


      
//finding leftsum
        for(int i=0;i<length;i++){
            sum=0;
            for(int j=0;j<i;j++){
                sum+=nums[j];
            }
            sumleft[i]=sum;
        }


        //finding right sum

        for(int i=0;i<length;i++) {
            sum = 0;
            for (int j = i+1; j <length; j++) {
                sum += nums[j];
            }
            sumright[i] = sum;
        }
        
        //finding answer array
        
        for(int i=0;i<length;i++){
             result=sumleft[i]-sumright[i];
            if(result<0){
                result=result*(-1);
            }
            answer[i]=result;
        }


        return answer;
    }
}