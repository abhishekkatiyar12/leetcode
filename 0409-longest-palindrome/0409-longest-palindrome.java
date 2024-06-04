import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

     
        int oddValue = 0;
int max=0;
        boolean b=false;
        int oddCount=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                max+=entry.getValue();
            }else{
                b=true;
                max+=entry.getValue()-1;
            }
        }
        if(b){
        max+=1;     
        }
       
        System.out.println(max);
        return max;
    }
}