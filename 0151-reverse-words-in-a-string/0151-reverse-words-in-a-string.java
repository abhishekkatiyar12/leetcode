class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and replace multiple spaces with a single space
        String newString = s.trim().replaceAll("\\s+", " ");
       
        
        // Split the normalized string into words
        String[] words = newString.split(" ");
        // StringBuilder result = new StringBuilder();
         String[] reversedWords = new String[words.length];
        
        // Add words to the array in reverse order
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - 1 - i];
        }
        
        // Join the reversed words into a single string
        String result = String.join(" ", reversedWords);
//         // Iterate through the words array in reverse order and append to result
//         for (int i = words.length - 1; i >= 0; i--) {
//             result.append(words[i]);
//             if (i != 0) {
//                 result.append(" ");
//             }
//         }
        
        return result;
        // return result.toString();
    }
}
    