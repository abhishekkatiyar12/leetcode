class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String result = "";

        if (s.length() == 0)
            return result;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > maxLength) {
                    maxLength = sub.length();
                    result = sub;
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
