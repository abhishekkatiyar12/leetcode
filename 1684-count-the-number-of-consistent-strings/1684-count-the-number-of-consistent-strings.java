class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     int count=0;
       
      for(int i=0;i<words.length;i++){
          String temp=words[i];
          boolean t=true;
          for(int j=0;j<temp.length();j++){
              if (!allowed.contains(String.valueOf(temp.charAt(j)))){
                  t=false;
                  break;
              }
                 
          }
          if(t==true){
              count++;
          }
      }
        return count;
    }
}