//time complexity : O(n)
//space complexity : O(1)
//difficulty : easy

class Solution {
    public int pivotIndex(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
