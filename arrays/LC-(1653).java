class Solution {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();
        int deletions = 0;
        int b_count = 0;

        for (char c : chars) {
            if (c == 'b') {
                b_count++;
            } else {
                if (b_count > 0) {
                    deletions++; 
                    b_count--;
                }
            }
        }

        return deletions;
    }
}
