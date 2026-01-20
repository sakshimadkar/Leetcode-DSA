import java.util.*;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            int best = Integer.MAX_VALUE;

            // Try removing one power of two
            for (int k = 0; k < 31; k++) {
                int p = 1 << k;
                if (p > x) break;

                int a = x - p;
                if (a >= 0 && (a | (a + 1)) == x) {
                    best = Math.min(best, a);
                }
            }

            ans[i] = (best == Integer.MAX_VALUE) ? -1 : best;
        }

        return ans;
    }
}
