class Solution {
    public int numberOfSteps(int num) {
        int result=0;
       while(num!=0){
           if( num>0 && num%2==0){
               result+=1;
               num=num/2;
           }
           if(num>0 && num%2!=0){
               result+=1;
               num=(num-1);
           }
       }
        return result;
    }
}
    