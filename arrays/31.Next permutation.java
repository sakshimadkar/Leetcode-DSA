class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;

        // STEP 1: Find break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // STEP 2: If no break point, reverse entire array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // STEP 3: Find next greater element from right
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // STEP 4: Reverse the suffix
        reverse(nums, index + 1, n - 1);
    }

       //  SWAP METHOD 
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // REVERSE METHOD
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
