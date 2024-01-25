class Solution {
    public boolean isAcronym(List<String> words, String s) {
       
    

        // ArrayList<String> words=new ArrayList<>();
        // words.add("alice");
        // words.add("bob");
        // words.add("charlie");
        // String s="abc";
        String result="";
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            result+=word.charAt(0);
        }
        System.out.println("result= "+result);
      // boolean bool=true;
        if(result.length()!=s.length()){
            return false;
        }
        for(int i=0;i<result.length();i++){
            if(result.charAt(i)!=s.charAt(i)){
                return false;
            }
        }
        return true;
        
    }
}
        
        
    