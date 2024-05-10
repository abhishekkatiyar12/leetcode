class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowel=0;
        int consonant=0;
        for(int i=0;i<word.length();i++){
            int ch=word.charAt(i);
            if((97<=ch && ch <=122)||(65<=ch && ch <=90)||(48<=ch && ch<=57)){
                
                     if((97<=ch && ch <=122)||(65<=ch && ch <=90)){
                                 ch=Character.toLowerCase(ch);
                          if(ch==97||ch==101||ch==105||ch==111||ch==117){
                                vowel++;
                          }else{
                               consonant++;
                  }
                }
                
            }else{
                return false;
            }
        }
        
    
                if(vowel ==0 || consonant==0 ){
                   return false;
               }
               return true;
 }
}