class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            index = checkInstance(t, ch, index);
            if (index == -1) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static int checkInstance(String t, char ch, int index) {
        for (int i = index; i < t.length(); i++) {
            if (ch == t.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
