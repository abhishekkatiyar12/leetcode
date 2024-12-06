import java.util.*;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // Create a HashSet of banned elements for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : banned) {
            set.add(num);
        }

        // List to store all available numbers (from 1 to n)
        ArrayList<Integer> list = new ArrayList<>();

        // Add all numbers from 1 to n that are not banned
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        // Sort the list in ascending order to try smaller numbers first
        Collections.sort(list);

        int count = 0, sum = 0;
        // Add numbers starting from the smallest until the sum exceeds maxSum
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (sum > maxSum) {
                break;
            }
            count++;
        }

        return count;
    }
}
