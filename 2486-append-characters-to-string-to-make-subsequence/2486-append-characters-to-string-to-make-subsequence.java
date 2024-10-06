class Solution {
    public int appendCharacters(String s, String t) {
        int index=0;
        int result=t.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(index)){
                result--;
                 index++;
                if(index>=t.length()){
                    return result;
                }
               
            }
        }
       return result;
    }
}