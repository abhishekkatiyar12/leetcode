class Solution {
    public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToTMapping = new HashMap<>();
        HashMap<Character, Character> tToSMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check s to t mapping
            if (sToTMapping.containsKey(charS)) {
                if (sToTMapping.get(charS) != charT) {
                    return false; // s to t mapping conflict
                }
            } else {
                sToTMapping.put(charS, charT);
            }

            // Check t to s mapping
            if (tToSMapping.containsKey(charT)) {
                if (tToSMapping.get(charT) != charS) {
                    return false; // t to s mapping conflict
                }
            } else {
                tToSMapping.put(charT, charS);
            }
        }

        return true;
    }

 
}

        
        