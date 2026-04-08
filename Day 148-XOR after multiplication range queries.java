class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
            int sum=0;
        int mod=1000000007;
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            int k=q[i][2];
            int v=q[i][3];
            int idx=l;
            while(idx<=r){
                nums[idx]=(int)(((long)nums[idx]*v)%mod);
                idx+=k;
            }
        }
            for(int ele:nums){
                sum=sum^ele;
            }
        return sum;
    }
}