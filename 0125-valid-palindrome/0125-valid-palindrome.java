class Solution {
    public boolean isPalindrome(String s) {
             String s1=s.toLowerCase();
     String s2="";

        for(int i=0;i<s1.length();i++){
            int character=s1.charAt(i);
            if((character>=97 && character<=122)|| (character>=48 && character<=57)){
                s2+=s1.charAt(i);
            }
        }
        String reverse="";
        for(int i=s2.length()-1;i>=0;i--){
            reverse+=s2.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(s2);
        boolean result=true;
        for(int i=0;i<reverse.length();i++){
            if(reverse.charAt(i)!=s2.charAt(i)){
                result =false;
                }
        }
        if(result==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        return result;
    }
}
    