class Solution {
    public String defangIPaddr(String s) {
        
        String result="";
             for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='.'){
                     result+="[.]";
               // result+='[';
               // result+='.';
               // result+=']';
           }else{
                   result+=s.charAt(i);
               }
       }
        System.out.println(result);
 return result;

    }
}
        
    