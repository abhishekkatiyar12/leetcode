class Solution {
    public int minLength(String s) {
        // Loop as long as "AB" or "CD" are found in the string
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "");  // Remove all occurrences of "AB"
            s = s.replace("CD", "");  // Remove all occurrences of "CD"
        }
        return s.length();
    }
}
