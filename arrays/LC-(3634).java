class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length, max_w_zise = 1; // → Initialize: n = array length, max window size starts at 1 (single element is always balanced)
        Arrays.sort(nums); // → Sort the array in ascending order

        int right = 0; // → Initialize right pointer for sliding window
        for (int left = 0; left < n; left++) { // → For each possible minimum element (left pointer)
            while (right < n && nums[right] <= k * (long)nums[left]) right++; // → Expand window while condition holds
            
            int w_size = right - left; // → Current window size = elements from left to right-1
            max_w_zise = Math.max(max_w_zise, w_size); // → Update maximum window size found so far
        }

        return n - max_w_zise; // → Answer = total elements - maximum elements we can keep
    }
}
