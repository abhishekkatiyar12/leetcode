import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        
        
        Arrays.sort(happiness);
        int count=0;
        // Select k children with the highest happiness values
        for (int i = happiness.length - 1; i >= 0 && count!=k; i--) {
            // Calculate the happiness value after k turns
            int selectedHappiness = Math.max(0, happiness[i] -count);
            
            // Accumulate the maximum possible happiness sum
            ans += selectedHappiness;
            
            count++; // Decrement the number of turns left
        }
        
        return ans;
    }
}
