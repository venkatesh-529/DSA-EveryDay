class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int ele:nums) sum+=ele;
        int c=0;
        for(int i=0;i<n-1;i++){
        sum-=nums[i];
            int d=n-i-1;
            if((long)nums[i]*d>sum) c++;
        }
    return c;
    }
}