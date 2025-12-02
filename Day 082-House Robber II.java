class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int a[]=new int[nums.length-1];
        int b[]=new int[nums.length-1];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0) a[j++]=nums[i];
            if(i!=nums.length-1) b[k++]=nums[i];
        }
        return Math.max(helper(a),helper(b));
    }
    public static int helper( int[] a){
        int n=a.length;
        if(n==0) return 0;
        if(n==1) return a[0];
        int dp[]=new int[a.length+1];
        dp[0]=a[0];
        dp[1]=Math.max(dp[0],a[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
        }
        return dp[n-1];
    }
}