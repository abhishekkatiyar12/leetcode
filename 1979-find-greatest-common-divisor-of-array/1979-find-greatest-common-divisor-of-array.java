class Solution {
    public int findGCD(int[] nums) {
     
        int result=0;
        System.out.println("length = " + nums.length);
        int smallest=nums[0];
        int largest=nums[0];
        for (int i = 0; i < nums.length; i++) {
                if(smallest>nums[i]){
                   smallest=nums[i];
                }
                if(largest<nums[i]){
                    largest=nums[i];
                }
        }
        System.out.println("smallest number = "+smallest);
        System.out.println("largest number = "+largest);

        for(int j=smallest;j>=1;j--) {
           
                if (largest %j == 0 && smallest%j==0) {
                  result=j;
                  break;
                    }
                }
        System.out.println(result);
        return result;

    }
}
    