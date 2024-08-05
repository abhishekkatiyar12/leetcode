class Solution {
    public String kthDistinct(String[] arr, int k) {
         Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (String s : arr) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        
        // Traverse the array again to find the k-th distinct string
        int distinctCount = 0;
        for (String s : arr) {
            if (frequencyMap.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }
        
        // If there are fewer than k distinct strings, return an empty string
        return "";
    }
    }
