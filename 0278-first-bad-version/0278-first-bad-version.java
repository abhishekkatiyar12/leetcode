/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
         int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // If mid is bad, search in the left half including mid
                right = mid;
            } else {
                // If mid is not bad, search in the right half excluding mid
                left = mid + 1;
            }
        }
        
        // When left == right, we have found the first bad version
        return left;
    }
    }
