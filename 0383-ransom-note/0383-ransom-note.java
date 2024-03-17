class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
        if (magazine.length() < ransomNote.length()) {
           // System.out.println("false");
            return false;
        }

        StringBuilder modifiedMagazine = new StringBuilder(magazine);

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int index = modifiedMagazine.indexOf(String.valueOf(ch));
            if (index == -1) {
                // System.out.println("false");
                return false;
            } else {
                modifiedMagazine.setCharAt(index, '-');
            }
        }

        return true;
    }
}

    