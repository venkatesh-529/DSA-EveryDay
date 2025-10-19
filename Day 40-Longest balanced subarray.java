class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            Set<Integer> e=new HashSet<>();
            Set<Integer> o=new HashSet<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0) e.add(nums[j]);
                else o.add(nums[j]);
            if(e.size()==o.size())max=Math.max(max,j-i+1);
        }
        }     
        return max;
    }
}