class Solution {
    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands += 1;
                    markIsland(grid, i, j, rows, cols);
                }
            }
        }

        return numIslands;
    }

    private void markIsland(char[][] grid, int i, int j, int rows, int cols) {
        grid[i][j] = '0';  // Mark the current cell as visited

        // Check and mark all adjacent land cells in brute-force manner
        if (i > 0 && grid[i - 1][j] == '1') {
            markIsland(grid, i - 1, j, rows, cols); // Up
        }
        if (i < rows - 1 && grid[i + 1][j] == '1') {
            markIsland(grid, i + 1, j, rows, cols); // Down
        }
        if (j > 0 && grid[i][j - 1] == '1') {
            markIsland(grid, i, j - 1, rows, cols); // Left
        }
        if (j < cols - 1 && grid[i][j + 1] == '1') {
            markIsland(grid, i, j + 1, rows, cols); // Right
        }
    }
    }
