class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int smallest=0;
        int temp=0;
        boolean result;
        for(int i=0;i<nums1.length;i++){
          temp=nums1[i];
            result=matchChecker(temp,nums2);
            if(result==true){
                return temp;
                //break;
            }
        }return -1;
    }
    public static boolean matchChecker(int temp,int[] num){
                  for(int i=0;i<num.length;i++){
                     if(temp==num[i]){
                         return true;
                     }else if(temp<num[i]){
                         return false;
                     }
                  }
                   return false;
    }
    
}