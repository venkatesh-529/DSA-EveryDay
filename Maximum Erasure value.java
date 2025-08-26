class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> s=new HashSet<>();
        int max=0,sum=0,j=0;
        for(int i=0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[j]);
                sum-=nums[j++];
            }
            s.add(nums[i]);
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}