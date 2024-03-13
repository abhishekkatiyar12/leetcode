class Solution {
    public String reverseVowels(String s) {
        String result="";
        String vowel="";
        char ch;
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel+=ch;
            }
        }
       int index=0;
        for(int i=0;i<s.length();i++){
              ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                result+=vowel.charAt(index);
                index++;
            }else{
                result+=s.charAt(i);
            }
        }
        return result;
        }
    }
