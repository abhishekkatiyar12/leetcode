class Solution {
    public char findTheDifference(String s, String t) {
        
    
        char result = 0; // Initialize result with 0

        // XOR all the characters in both strings
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}