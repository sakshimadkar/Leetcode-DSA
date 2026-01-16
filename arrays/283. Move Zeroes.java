//time complexity : O(n)
//space complexity : O(1)
//difficulty : easy

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){   //to fillt eh non-zero positions.
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        while(k<nums.length){     //to fill the remaining position with zeroes.
            nums[k++]=0;
        }
    }
}
