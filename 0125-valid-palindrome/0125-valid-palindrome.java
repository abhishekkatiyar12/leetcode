class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        // String[] arr=s.split(" ");
        // String str=new String(arr);
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
            sb.append(s.charAt(i));
        }
        }
        
        if(checkPalindrome(String.valueOf(sb))){
            return true;
        }else{
            return false;
        }
        
        
    }
      
    
    
    
    public static boolean checkPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(s.equals(String.valueOf(sb))){
            return true;
        }else{
            return false;
        }
    }
}