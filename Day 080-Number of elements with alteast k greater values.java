class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(n-find(n,nums,nums[i])>=k) ans++;
        }
        return ans;
    }
    public static int find(int n,int[] a,int x){
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]<=x){
                l=m+1;
            }else r=m-1;
        }
        return l;
    }
}