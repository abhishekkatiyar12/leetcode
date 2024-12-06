import java.util.*;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : banned) {
            set.add(num);
        }

        
        ArrayList<Integer> list = new ArrayList<>();

        
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        
        
        Collections.sort(list);

        int count = 0, sum = 0;
        
        
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
