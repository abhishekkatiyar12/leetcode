class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] answer = new int[n];
        
        // Initialize leftProducts and rightProducts with all 1s
        for (int i = 0; i < n; i++) {
            leftProducts[i] = 1;
            rightProducts[i] = 1;
        }
        
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Calculate suffix products
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Compute the result array
        for (int i = 0; i < n; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }
        
        return answer;
    }
}
