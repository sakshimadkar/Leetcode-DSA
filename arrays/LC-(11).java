class Solution {
    public int maxArea(int[] h) {

        int l = 0, r = h.length - 1;
        int max = 0;

        while (l < r) {
            int hl = h[l];
            int hr = h[r];

            int area = (hl < hr ? hl : hr) * (r - l);
            if (area > max) max = area;

            if (hl < hr) l++;
            else r--;
        }
        return max;
    }
}
