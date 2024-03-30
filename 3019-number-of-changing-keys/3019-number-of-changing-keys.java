class Solution {
    public int countKeyChanges(String s) {
        if (s == null || s.length() <= 1) {
            return 0; // No key changes if string is null or has length <= 1
        }
        
        int changes = 0;
        char lastChar = s.charAt(0); // Initialize with the first character
        
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if the characters are different (ignoring cases)
            if (Character.toLowerCase(currentChar) != Character.toLowerCase(lastChar)) {
                changes++;
            }
            
            lastChar = currentChar; // Update last character
        }
        
        return changes;
    }
}
