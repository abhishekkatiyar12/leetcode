class Solution {
    public int passThePillow(int n, int time) {
     int cycleLength = 2 * (n - 1);

        // Find the effective time within one cycle using modulo operation.
        int effectiveTime = time % cycleLength;

        // Determine the position based on the effective time.
        if (effectiveTime < n) {
            // Pillow is moving forward in the cycle.
            return 1 + effectiveTime;
        } else {
            // Pillow is moving backward in the cycle.
            return n - (effectiveTime - n + 1);
        }
    }
}

