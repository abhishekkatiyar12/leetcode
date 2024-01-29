class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       
        HashSet<String> reversedSet = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();

            if (reversedSet.contains(word)) {
                // Found a pair
                count++;
                reversedSet.remove(word); // Avoid duplicate pairs
            } else {
                // No match found, add the reversed word to the set
                reversedSet.add(reversedWord);
            }
        }

        return count;
    }

}