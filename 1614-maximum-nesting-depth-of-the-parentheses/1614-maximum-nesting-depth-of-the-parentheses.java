class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='('){
                count++;
                max=Math.max(max,count);
            }else if(ch==')'){
                count--;
            }
        }
        return max;
    }
}