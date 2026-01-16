//time complexity : O(n)
//space complexity : O(1)
//difficulty : easy

class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(leftSquare>rightSquare){
                res[i]=leftSquare;
                left++;
            }
            else{
                res[i]=rightSquare;
                right--;
            }
        }
        return res;
    }
}
