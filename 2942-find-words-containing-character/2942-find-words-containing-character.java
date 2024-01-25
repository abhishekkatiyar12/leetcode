class Solution {
    public List<Integer> findWordsContaining(String[] s, char ch) {
            ArrayList<Integer> list =new ArrayList<>() ;

      //  String[] s=new String[] {"abc","bcd","aaaa","cbc"};
       //char ch='a';
       int length=0;
       for(int i=0;i<s.length;i++){
           length=s[i].length();
           for(int j=0;j<length;j++){
               if(ch==s[i].charAt(j)){
                   list.add(i);
                   break;
               }
           }
       }
        System.out.println(list);
return list;
    }
}
    