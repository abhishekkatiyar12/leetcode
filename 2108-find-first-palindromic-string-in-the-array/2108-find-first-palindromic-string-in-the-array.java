class Solution {
    public String firstPalindrome(String[] words) {
        
       String result1="";
        for(int i=0;i<words.length;i++){
            String a=words[i];
           
            int length=a.length();

            boolean result=checkPalindrome(a);
            if(result==true){
                System.out.println(a);
                return a;
            }
        }
        return  result1;
    }
    
    public static boolean checkPalindrome(String s) {

        boolean result = true;
        String z = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            z += s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != z.charAt(i)) {
                result = false;
            }
        }
        return result;
    }

}
        
    
