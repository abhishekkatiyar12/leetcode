class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int maxOnesRow = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < m; i++) {
            int onesCount = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    onesCount++;
                }
            }

            if (onesCount > maxOnesCount || (onesCount == maxOnesCount && i < maxOnesRow)) {
                maxOnesRow = i;
                maxOnesCount = onesCount;
            }
        }
           if(maxOnesRow==-1){
               maxOnesRow=0;
           }
        return new int[]{maxOnesRow, maxOnesCount};
    }
}
