//396. Rotate Function

class Solution {
    public int maxRotateFunction(int[] nums) {
        int tot=0;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            tot+=(nums[i]*i);
            sum+=nums[i];
        }
        int ans=tot;
        for(int j=n-1;j>=0;j--){
            tot-=((n-1)*nums[j]);
            tot+=(sum-nums[j]);
            ans=Math.max(ans,tot);
        }
        return ans;
    }
}
