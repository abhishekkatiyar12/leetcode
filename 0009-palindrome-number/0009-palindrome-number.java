class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,reverse=0;
        if(x<0){
            return false;
        }
        while(temp>0){
            reverse=reverse*10+temp%10;
            temp=temp/10;
        }
        if(reverse==x){
            return true;
        }
        return false;
    }
}