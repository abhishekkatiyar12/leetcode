class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[arr1.length];
        int index = 0;

        // Count the occurrences of each element in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Place the elements of arr2 in result array in the correct order
        for (int num : arr2) {
            int count = map.get(num);
            while (count > 0) {
                result[index++] = num;
                count--;
            }
            map.remove(num); // Remove the element from the map after processing
        }

        // Process remaining elements that are not in arr2
        int remainingSize = 0;
        for (int count : map.values()) {
            remainingSize += count;
        }
        
        int[] remaining = new int[remainingSize];
        int remIndex = 0;

        for (int num : arr1) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    remaining[remIndex++] = num;
                    count--;
                }
                map.remove(num); // Remove to avoid duplicate processing
            }
        }

        // Sort the remaining elements and add them to the result array
        Arrays.sort(remaining);
        for (int num : remaining) {
            result[index++] = num;
        }

        return result;
    }
}