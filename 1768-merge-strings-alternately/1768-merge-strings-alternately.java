class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result="";
        int length=0;
        if(word1.length()<word2.length()){
            length=word1.length();
        }else{
            length=word2.length();
        }
        
        for(int i=0;i<length;i++){
            result+=word1.charAt(i);
             result+=word2.charAt(i);
        }
        if(word1.length()<word2.length()){
            for(int i=length;i<word2.length();i++){
                result+=word2.charAt(i);
            }
        }
            if(word2.length()<word1.length()){
            for(int i=length;i<word1.length();i++){
                result+=word1.charAt(i);
            }
        }
        
        return result;
    }
}