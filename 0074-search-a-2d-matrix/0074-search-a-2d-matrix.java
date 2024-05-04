class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Perform binary search on the flattened matrix
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index back to 2D index

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
