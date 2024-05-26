class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and replace multiple spaces with a single space
        String newString = s.trim().replaceAll("\\s+", " ");
       
        
        // Split the normalized string into words
        String[] words = newString.split(" ");
        StringBuilder result = new StringBuilder();
        
        // Iterate through the words array in reverse order and append to result
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        
        
        return result.toString();
    }
}
    