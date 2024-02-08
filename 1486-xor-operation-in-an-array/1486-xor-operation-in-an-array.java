class Solution {
    public int xorOperation(int n, int start) {
      
        int result=0;
        int[] num1=new int[n];
        for(int i=0;i<n;i++) {

            num1[i]= start + 2 * i;
            if(i==0){
                result=num1[i];
            }else{
                result^=num1[i];
            }
        }
        return result;
    }
}