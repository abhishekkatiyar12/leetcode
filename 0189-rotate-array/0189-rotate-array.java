class Solution {
    public void rotate(int[] nums, int k) {
       int len=nums.length;
        
        k=k%len;
        
       
            int[] rotated=new int[len];
            
            for(int i=0;i<len;i++){
                rotated[(i+k)%len]=nums[i];
            }
            
             for(int i=0;i<len;i++){
                nums[i]=rotated[i];
            }
        
        
    }
}