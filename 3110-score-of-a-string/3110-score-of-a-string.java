class Solution {
    public int scoreOfString(String s) {
        int score =0;
       for(int i=0;i<s.length()-1;i++){
           int s1=s.charAt(i);
           int s2=s.charAt(i+1);
           score+=Math.abs(s1-s2);
       }
        return score;
    }
}