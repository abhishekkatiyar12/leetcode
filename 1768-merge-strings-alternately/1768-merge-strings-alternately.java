class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result="";
        int first=0,second=0;
        
        while(first<word1.length()|| second<word2.length()){
            if(first<word1.length()){
                result+=word1.charAt(first);
                first++;
            }
             if(second<word2.length()){
                result+=word2.charAt(second);
                second++;
            }
        }
        
        return result;
    }
}