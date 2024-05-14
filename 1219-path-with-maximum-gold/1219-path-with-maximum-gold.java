class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Iterate over each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) { // Found a cell with gold
                    int currentGold = findMaxGold(grid, i, j);
                    maxGold = Math.max(maxGold, currentGold);
                }
            }
        }
        return maxGold;
    }

    private int findMaxGold(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0; // Out of bounds or no gold in this cell
        }

        // Store the current cell's gold and mark it as visited (set to 0)
        int currentGold = grid[row][col];
        grid[row][col] = 0;

        // Explore all four possible directions
        int right = findMaxGold(grid, row, col + 1); // Move right
        int left = findMaxGold(grid, row, col - 1); // Move left
        int down = findMaxGold(grid, row + 1, col); // Move down
        int up = findMaxGold(grid, row - 1, col); // Move up

        // Restore the original value of the current cell
        grid[row][col] = currentGold;

        // Return the maximum gold that can be collected starting from this cell
        return currentGold + Math.max(right, Math.max(left, Math.max(down, up)));
    }
}
