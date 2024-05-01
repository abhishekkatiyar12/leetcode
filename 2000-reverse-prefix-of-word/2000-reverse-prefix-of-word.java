class Solution {
    public String reversePrefix(String word, char ch) {
        
        if(word.length()==0||word.length()==1){
            return word;
        }
        String result="";
        int index=0;
        for(int i=0;i<word.length();i++) {
            if (word.charAt(i) == ch) {
                index = i;
    
                break;
            }
        }

            for(int j=index;j>=0;j--){
               result+=word.charAt(j);
            }

        
          for(int i=index+1;i<word.length();i++){
              result+=word.charAt(i);
          }
      
        return result;
    }
}