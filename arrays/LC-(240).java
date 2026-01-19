class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       //number of rows
        int n = matrix[0].length;    //number of columns

        int row = 0;     //first row
        int col = n-1;   //last column

        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if (matrix[row][col]>target){   //if target value is greater,move left
                col--;        //move left 
            }
            else{            //if target value is smaller,move down
                row++;       //move down
            }
        }
        return false;       //if not found
    }
}
