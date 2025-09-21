class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int ele:nums){
            if(ele%2==0) ans|=ele;
        }
        return ans;
    }
}