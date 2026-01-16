//time complexity : O(n)
//space complexity : O(1)
//difficulty : medium 

class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        reverseArray(nums,0,nums.length-1);  //reverse the entire array.
        reverseArray(nums,0,k-1);            //reverse first k elements.
        reverseArray(nums,k,nums.length-1);  //reverse remaining n-k elements. 
    }
    private void reverseArray(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
