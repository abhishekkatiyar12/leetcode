class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int countOdd = 0;
        int niceSubarrays = 0;
        int[] prefixCount = new int[nums.length + 1];
        prefixCount[0] = 1; // There is one way to have zero odd numbers initially
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                countOdd++;
            }
            
            if (countOdd >= k) {
                niceSubarrays += prefixCount[countOdd - k];
            }
            
            prefixCount[countOdd]++;
        }
        
        return niceSubarrays;
    }
}
