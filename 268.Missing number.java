class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;

        // XOR all indices and values
        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        // XOR with n
        xor ^= nums.length;

        return xor;
    }
}
