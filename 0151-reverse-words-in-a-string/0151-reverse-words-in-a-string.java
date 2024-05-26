class Solution {
    public String reverseWords(String s) {
        if(s.length()<=1){
            return s;
        }
        String newString= s.trim();
        String newStrng=newString.replaceAll("\\s+"," ");
        System.out.println(newStrng);
        String result="";
        
        int right=newStrng.length();
        int left=0;
        for(int i=newStrng.length()-1;i>=0;i--){
           if(newStrng.charAt(i)==' '){
               left=i+1;
              String temp=newStrng.substring(left,right);
             result= prepareString(temp,result);
              
               right=i;
           }
            
            
        }
        left=0;
            String temp=newStrng.substring(left,right);
             result= prepareString(temp,result);
        System.out.println(result.trim());
        return result.trim();
    }
    public static String prepareString(String s,String result){
       return  (result+s+" ");
    }
}
