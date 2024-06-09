class Solution {
    public int addDigits(int num) {
         int result=num;
        
        while(result>9){
           result=addInteger(result);
        }
        return result;
    }
    public int addInteger(int x){
        int sum=0;
        
        while(x>0){
            sum+=x%10;
            x /=10;
        }
        return sum;
    }
}