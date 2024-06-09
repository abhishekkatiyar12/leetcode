class Solution {
    public boolean isPalindrome(String s) {
        // Convert the input string to lowercase
        String s1 = s.toLowerCase();
        
        // StringBuilder to build the filtered string with only alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        
        // Filter out non-alphanumeric characters
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                filtered.append(c);
            }
        }
        
        // Get the filtered string
        String s2 = filtered.toString();
        
        // Reverse the filtered string using StringBuilder
        String reverse = filtered.reverse().toString();
        
        // Check if the filtered string is equal to its reverse
        return s2.equals(reverse);
    }
}
