class Solution {
    public long rob(int[] nums, int[] c) {
        int n=nums.length;
        long dp[]=new long[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            long not=dp[i-1];
            if( c[i]==c[i-1])
                dp[i]=nums[i]+(i>1?dp[i-2]:0);
            else dp[i]=dp[i-1]+nums[i];
            dp[i]=Math.max(dp[i],not);
        }
        return dp[n-1];
    }
}