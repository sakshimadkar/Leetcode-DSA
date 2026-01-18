class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){
            //traverse top row
            for(int col = left ; col<=right ; col++){
                result.add(matrix[top][col]);
            }
            top++;

            //traverse the right column
            for(int row = top; row<=bottom ; row++){
                result.add(matrix[row][right]);
            }
            right--;

            //traverse bottom row(check needed)
            if(top<=bottom){
                for(int col =right; col>=left ; col--){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            //traverse left column (check needed)
            if(left<=right){
                for(int row = bottom ; row>=top ; row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
}
