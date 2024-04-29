class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
         Arrays.sort(candidates);
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Call the helper function to find combinations
        findCombinations(candidates, target, 0, new ArrayList<>(), listOfLists);
        return listOfLists;
    }

    private static void findCombinations(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // If target is reached, add current combination to the result
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];

            // If current candidate exceeds the remaining target, stop processing
            if (candidate > target)
                break;

            
            // Add candidate to the current combination
            current.add(candidate);

            // Recursively search for combinations with the updated target
            findCombinations(candidates, target - candidate, i, current, result);

            // Remove the last added candidate to backtrack
            current.remove(current.size() - 1);
        }
    }
}

        
    