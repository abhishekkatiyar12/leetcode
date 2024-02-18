class Solution {
    public int lengthOfLastWord(String s) {
        
       int length=s.length();
       int count=0;
        for(int i=length-1;i>=0;i--){
            if(count==0 && s.charAt(i)==' '){
                continue;
            } else if (count!=0 && s.charAt(i)==' ') {
                break;
            }else {
                count++;
            }
        }
        
        return count;

    }
}
    