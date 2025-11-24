class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean b[]=new boolean[n];
        b[0]=true;
        for(int i=0;i<nums.length;i++){
            if(b[i]){
                int ele=nums[i];
                for(int j=i+1;j<=i+ele && j<n;j++) b[j]=true;;
            }
            else break;
        }
        return b[n-1];
    }
}