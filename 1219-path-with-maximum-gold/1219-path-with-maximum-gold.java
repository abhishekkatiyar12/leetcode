class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;

        // Iterate over each cell to start the DFS from cells with gold
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) { // Found a cell with gold
                    int currentGold = dfs(grid, i, j);
                    maxGold = Math.max(maxGold, currentGold);
                }
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int row, int col) {
        // Base cases: Out of grid bounds or cell has 0 gold
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        // Store the current cell's gold and mark it as visited (set to 0)
        int currentGold = grid[row][col];
        grid[row][col] = 0;

        // Explore all four possible directions
        int right = dfs(grid, row, col + 1); // Move right
        int left = dfs(grid, row, col - 1); // Move left
        int down = dfs(grid, row + 1, col); // Move down
        int up = dfs(grid, row - 1, col); // Move up

        // Restore the original value of the current cell
        grid[row][col] = currentGold;

        // Return the maximum gold that can be collected starting from this cell
        return currentGold + Math.max(right, Math.max(left, Math.max(down, up)));
    }
}
