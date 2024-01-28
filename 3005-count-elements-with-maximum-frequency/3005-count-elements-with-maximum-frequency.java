class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        // Count the number of elements with maximum frequency
        int count = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                count++;
            }
        }

        // Calculate and return the total frequencies of elements with maximum frequency
        return count * maxFrequency;
    }
}