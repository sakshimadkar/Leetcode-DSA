class Solution {

    // Function to calculate sum of digits
    static long digitSum(long x) {
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public long getCount(int n, int d) {

        long low = 1, high = n;
        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid - digitSum(mid) >= d) {
                ans = mid;
                high = mid - 1;   // try smaller
            } else {
                low = mid + 1;
            }
        }

        if (ans == -1) return 0;

        return n - ans + 1;
    }
}
