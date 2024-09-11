class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum=mean*(m+n);
        int temp=0;
        for(int i=0;i<m;i++){
            temp+=rolls[i];
        }
        int missing=sum-temp;
         if (missing < n || missing > 6 * n) {
            return new int[0];  // Return empty array if it's impossible
        }
        
        // Create the result array for missing rolls
        int[] result = new int[n];
        Arrays.fill(result, 1);  // Start with minimum possible value (1 for each roll)
        
        // Remaining sum to distribute
        missing -= n;
        
        // Distribute the remaining sum across the rolls
        int i = 0;
        while (missing > 0) {
            int add = Math.min(5, missing);  // We can add at most 5 to each roll
            result[i] += add;
            missing -= add;
            i++;
        }
        
        return result;
    }
    
}