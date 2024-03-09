class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp1 = "";
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Check if the current character is already in the substring
            int index = temp1.indexOf(ch);
            
            if (index == -1) {
                temp1 += ch;
            } else {
                // Update the maximum length if the current substring is longer
                maxLength = Math.max(maxLength, temp1.length());
                
                // Reset temp1 to start a new substring without the repeating character
                temp1 = temp1.substring(index + 1) + ch;
            }
        }
        
        // Check the length of the last substring
        maxLength = Math.max(maxLength, temp1.length());

        return maxLength;
    }
}
