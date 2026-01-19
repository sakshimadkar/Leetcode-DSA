class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;

        int[][] prefix = new int[m + 1][n + 1];

        // Build prefix sum
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }

        int left = 0, right = Math.min(m, n), ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (existsSquare(prefix, mid, threshold)) {
                ans = mid;
                left = mid + 1;   // try bigger
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean existsSquare(int[][] prefix, int size, int threshold) {
        if (size == 0) return true;

        int m = prefix.length - 1;
        int n = prefix[0].length - 1;

        for (int i = 0; i + size <= m; i++) {
            for (int j = 0; j + size <= n; j++) {
                int sum = prefix[i + size][j + size]
                        - prefix[i][j + size]
                        - prefix[i + size][j]
                        + prefix[i][j];

                if (sum <= threshold) return true;
            }
        }
        return false;
    }
}
