class Solution {
    public int countDigits(int num) {
        int result=0;
        // if number is smaller than 9 it means it is single digit number
          if(num<=9&&num>=0){
             return result+=1;
          }
          int temp=num;
        
        // if number is double digit
       while(num>9&& temp!=0){
           int val=temp%10;
           if(num%val==0){
               result+=1;
           }
          temp/=10;
       }
       return result;
    }
}
    