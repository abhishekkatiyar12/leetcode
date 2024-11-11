class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
           //if and only if the last two characters are different then only we are going to add that character in result;
            if (i < 2 || s.charAt(i) != s.charAt(i - 1) || s.charAt(i) != s.charAt(i - 2)) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
