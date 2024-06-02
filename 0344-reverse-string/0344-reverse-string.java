class Solution {
    public void reverseString(char[] s) {
         int length=s.length;
        for(int i=0;i<length/2;i++){
            char temp=s[i];
            s[i]=s[length-1-i];
            s[length-1-i]=temp;
        }
       //return s;
        System.out.println(s);
    }
}