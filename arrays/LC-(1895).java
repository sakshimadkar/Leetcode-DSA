class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] row = new int[m][n + 1];
        int[][] col = new int[m + 1][n];

        // Prefix sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
            }
        }

        int maxSize = Math.min(m, n);

        for (int size = maxSize; size >= 2; size--) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {

                    int target = row[i][j + size] - row[i][j];
                    boolean valid = true;

                    // rows
                    for (int r = i; r < i + size && valid; r++) {
                        if (row[r][j + size] - row[r][j] != target)
                            valid = false;
                    }

                    // columns
                    for (int c = j; c < j + size && valid; c++) {
                        if (col[i + size][c] - col[i][c] != target)
                            valid = false;
                    }

                    // diagonals
                    int diag1 = 0, diag2 = 0;
                    for (int d = 0; d < size; d++) {
                        diag1 += grid[i + d][j + d];
                        diag2 += grid[i + d][j + size - 1 - d];
                    }

                    if (valid && diag1 == target && diag2 == target)
                        return size;
                }
            }
        }

        return 1; // at least 1x1
    }
}
