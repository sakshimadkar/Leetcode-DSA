// LeetCode 1929: Concatenation of Array
// Difficulty: Easy
// Approach: Create new array of size 2*n
// Time: O(n), Space: O(n)

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
