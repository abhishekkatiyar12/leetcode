class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int k=groupSize;
         int loop = hand.length / k;
        if (hand.length % k != 0) {
            return false;
        }
        
        // Frequency map to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : hand) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Sorting the array to handle consecutive sequences
        Arrays.sort(hand);
        
        for (int num : hand) {
            if (countMap.get(num) == 0) {
                continue; // Skip if this number is already used completely
            }
            
            // Check if we can form a consecutive sequence starting with `num`
            for (int i = 0; i < k; i++) {
                int current = num + i;
                if (countMap.getOrDefault(current, 0) == 0) {
                    return false;
                }
                countMap.put(current, countMap.get(current) - 1);
            }
        }
        
        return true;
    }
}

    