class Solution {
    private class TrieNode {
        private TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    private String searchPrefix(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                break;
            }
            prefix.append(c);
            node = node.children[index];
            if (node.isEndOfWord) {
                return prefix.toString();
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        // Build the Trie from the dictionary
        for (String word : dictionary) {
            insert(word);
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Replace each word with the shortest matching prefix from the Trie
        for (int i = 0; i < words.length; i++) {
            words[i] = searchPrefix(words[i]);
        }

        // Join the words back into a sentence
        return String.join(" ", words);
    }
}