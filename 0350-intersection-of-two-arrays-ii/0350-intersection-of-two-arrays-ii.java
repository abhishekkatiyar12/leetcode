class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    
        List<Integer> result = new ArrayList<>();
        int[] frequency1 = new int[1001];  // Assuming the range of numbers is up to 1000
        int[] frequency2 = new int[1001];

        // Count frequency of each element in nums1
        for (int num : nums1) {
            frequency1[num]++;
        }

        // Count frequency of each element in nums2
        for (int num : nums2) {
            frequency2[num]++;
        }

        // Find intersection considering frequency
        for (int i = 0; i < 1001; i++) {
            int commonFrequency = Math.min(frequency1[i], frequency2[i]);
            for (int j = 0; j < commonFrequency; j++) {
                result.add(i);
            }
        }

        // Convert List to array
        int[] intersectionArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersectionArray[i] = result.get(i);
        }

        return intersectionArray;
        
    }
}