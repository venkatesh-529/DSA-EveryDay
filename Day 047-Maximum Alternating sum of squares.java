class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long ans=0;
        boolean val=true;
        for(int i=0;i<n;i++) nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        int l=0,h=n-1;
        while(l<=h){
            if(val){
                ans+=(long)nums[h]*nums[h];
                h--;
            }
            else{
                ans-=(long)nums[l]*nums[l];
                l++;
            }
            val=!val;
        }
        return ans;
    }
}