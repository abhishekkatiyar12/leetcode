class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int rem,sum=0;
        while(temp>0){
            sum +=temp%10;
            temp=temp/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}